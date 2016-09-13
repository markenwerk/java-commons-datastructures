/*
 * Copyright (c) 2016 Torsten Krause, Markenwerk GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.markenwerk.commons.datastructures;

import java.util.NoSuchElementException;

import net.markenwerk.commons.exceptions.ProvisioningException;
import net.markenwerk.commons.interfaces.Converter;
import net.markenwerk.commons.interfaces.Provider;

/**
 * An {@link Optional} is a simple immutable container class that may holds a
 * single value.
 * 
 * @param <Payload>
 *            The payload type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
public final class Optional<Payload> {

	private final boolean hasValue;

	private final Payload value;

	/**
	 * Creates a new {@link Optional} without a value.
	 */
	public Optional() {
		this.value = null;
		hasValue = false;
	}

	/**
	 * Creates a new {@link Optional}.
	 * 
	 * @param value
	 *            The value to be used.
	 */
	public Optional(Payload value) {
		this.value = value;
		hasValue = true;
	}

	/**
	 * Returns whether this {@link Optional} has a value.
	 * 
	 * @return Whether this {@link Optional} has a value.
	 */
	public boolean hasValue() {
		return hasValue;
	}

	/**
	 * Returns the value this {@link Optional} has been created with, if any.
	 * 
	 * @return The value.
	 * @throws NoSuchElementException
	 *             If this {@link Optional} has no value.
	 */
	public Payload getValue() throws NoSuchElementException {
		if (!hasValue) {
			throw new NoSuchElementException("This optional has no value");
		}
		return value;
	}

	/**
	 * Returns the value this {@link Optional} has been created with, if any, or
	 * the given fallback payload value.
	 * 
	 * @param fallback
	 *            The fallback payload value to be used.
	 * @return The value.
	 */
	public Payload getValue(Payload fallback) {
		return hasValue ? value : fallback;
	}

	/**
	 * Returns the value this {@link Optional} has been created with, if any, or
	 * a payload value provided by the given {@link Provider}.
	 * 
	 * @param provider
	 *            The {@link Provider} to be used.
	 * @return The value.
	 * 
	 * @throws IllegalArgumentException
	 *             If the given {@link Provider} is {@literal null}.
	 * @throws ProvisioningException
	 *             If the given {@link Provider} failed to provide a fallback
	 *             payload value.
	 */
	public Payload getValue(Provider<? extends Payload> provider) throws IllegalArgumentException,
			ProvisioningException {
		if (null == provider) {
			throw new IllegalArgumentException("The given provider is null");
		}
		return hasValue ? value : provider.provide();
	}

	/**
	 * Converts the payload value of this {@link Optional}, if present, and
	 * returns another {@link Optional}.
	 * 
	 * @param <Result>
	 *            The result type.
	 * @param converter
	 *            The {@link Converter} to be used.
	 * @return The result value returned by the given {@link OptionalHandler}.
	 * 
	 * @throws IllegalArgumentException
	 *             If the given {@link Converter} is {@literal null}.
	 */
	public <Result> Optional<Result> convert(Converter<? super Payload, ? extends Result> converter)
			throws IllegalArgumentException {
		return handle(new ConvertingOptionalHandler<Payload, Result>(converter));
	}

	/**
	 * Calls the appropriate method on the given {@link OptionalHandler}.
	 * 
	 * @param <Result>
	 *            The result type.
	 * @param handler
	 *            The {@link OptionalHandler} to be used.
	 * @return The result value returned by the given {@link OptionalHandler}.
	 * 
	 * @throws IllegalArgumentException
	 *             If the given {@link OptionalHandler} is {@literal null}.
	 */
	public <Result> Result handle(OptionalHandler<? super Payload, ? extends Result> handler)
			throws IllegalArgumentException {
		if (null == handler) {
			throw new IllegalArgumentException("The given handler is null");
		}
		return hasValue ? handler.onValue(value) : handler.onNoValue();
	}

	@Override
	public int hashCode() {
		return 31 * (hasValue ? 1231 : 1237) + ((null == value) ? 0 : value.hashCode());
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object == null) {
			return false;
		} else if (getClass() != object.getClass()) {
			return false;
		}
		Optional<?> other = (Optional<?>) object;
		if (hasValue != other.hasValue) {
			return false;
		} else if (null == value ? null != other.value : !value.equals(other.value)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Optional [hasValue=" + hasValue + ", value=" + value + "]";
	}

}

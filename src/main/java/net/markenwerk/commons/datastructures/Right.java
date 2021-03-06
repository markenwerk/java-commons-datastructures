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

/**
 * An {@link Right} is one of two distinct simple immutable container class that
 * holds a single value.
 *
 * @param <Left>
 *            The type of a {@link net.markenwerk.commons.datastructures.Left}
 *            {@link Either}.
 * @param <Payload>
 *            The type of a {@link net.markenwerk.commons.datastructures.Right}
 *            {@link Either}.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
@SuppressWarnings("hiding")
public final class Right<Left, Payload> extends Either<Left, Payload> {

	private final Payload value;

	/**
	 * Creates a new {@link Right}.
	 * 
	 * @param value
	 *            The Value to be used.
	 */
	public Right(Payload value) {
		this.value = value;
	}

	@Override
	public boolean isLeft() {
		return false;
	}

	@Override
	public Left getLeft() throws IllegalStateException {
		throw new IllegalStateException("Right has no left value.");
	}

	@Override
	public boolean isRight() {
		return true;
	}

	@Override
	public Payload getRight() {
		return value;
	}

	@Override
	public int hashCode() {
		return null == value ? 0 : value.hashCode();
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
		Right<?, ?> other = (Right<?, ?>) object;
		if (null == value ? null != other.value : !value.equals(other.value)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Right [value=" + value + "]";
	}

}

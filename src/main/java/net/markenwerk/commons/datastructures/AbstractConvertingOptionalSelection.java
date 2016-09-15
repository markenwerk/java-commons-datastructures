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
 * An {@link AbstractConvertingOptionalSelection} is a {@link OptionalSelection}
 * that converts the payload value of the
 * {@link Optional#select(OptionalSelection) handled} {@link Optional}, if
 * present, and returns another {@link Optional}.
 * 
 * @param <Payload>
 *            The payload type.
 * @param <Result>
 *            The result type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.3.0
 */
public abstract class AbstractConvertingOptionalSelection<Payload, Result> implements
		OptionalSelection<Payload, Optional<Result>> {

	@Override
	public Optional<Result> onNoValue() {
		return new Optional<Result>();
	}

	@Override
	public Optional<Result> onValue(Payload payload) {
		return new Optional<Result>(doConvert(payload));
	}

	/**
	 * Converts the payload value of the
	 * {@link Optional#select(OptionalSelection) handled} {@link Optional}.
	 * 
	 * @param payload
	 *            The payload value of the handled {@link Optional}.
	 * @return A result value.
	 */
	protected abstract Result doConvert(Payload payload);

}

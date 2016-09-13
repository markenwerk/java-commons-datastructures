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
 * An {@link OptionalHandler} can be used to
 * {@link Optional#handle(OptionalHandler) handle} an {@link Optional} and
 * obtain a result value, whether the {@link Optional}
 * {@link Optional#hasValue() has} a value or not.
 * 
 * @param <Payload>
 *            The payload type.
 * @param <Result>
 *            The result type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.2.0
 */
public interface OptionalHandler<Payload, Result> {

	/**
	 * Called by the {@link Optional#handle(OptionalHandler) handled}
	 * {@link Optional} if it {@link Optional#hasValue() has} no payload value.
	 * 
	 * @return A result value.
	 */
	public Result onNoValue();

	/**
	 * Called by the {@link Optional#handle(OptionalHandler) handled}
	 * {@link Optional} if it has {@link Optional#hasValue() has} a value.
	 * 
	 * @param payload
	 *            The payload value of the handled {@link Optional}.
	 * @return A result value.
	 */
	public Result onValue(Payload payload);

}

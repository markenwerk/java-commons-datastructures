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

import net.markenwerk.commons.interfaces.Converter;

/**
 * An {@link ConvertingOptionalHandler} is an
 * {@link AbstractConvertingOptionalHandler} that uses a {@link Converter} to
 * convert payload values.
 * 
 * @param <Payload>
 *            The payload type.
 * @param <Result>
 *            The result type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
public final class ConvertingOptionalHandler<Payload, Result> extends
		AbstractConvertingOptionalHandler<Payload, Result> {

	private final Converter<? super Payload, ? extends Result> converter;

	/**
	 * Creates a new {@link ConvertingOptionalHandler}.
	 * 
	 * @param converter
	 *            The converter to be used.
	 * @throws IllegalArgumentException
	 *             If the given {@link Converter} is {@literal null}.
	 */
	public ConvertingOptionalHandler(Converter<? super Payload, ? extends Result> converter)
			throws IllegalArgumentException {
		if (null == converter) {
			throw new IllegalArgumentException("The given converter is null");
		}
		this.converter = converter;
	}

	@Override
	protected Result doConvert(Payload payload) {
		return converter.convert(payload);
	}

}

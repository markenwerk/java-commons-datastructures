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
 * A {@link Box} is a simple mutable container class that holds a single value.
 * 
 * @param <Payload>
 *            The payload type.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.1.0
 */
public final class Box<Payload> {

	private Payload value;

	/**
	 * Creates a new {@link Box} with {@literal null} as the current value.
	 * 
	 */
	public Box() {
		this(null);
	}

	/**
	 * Creates a new {@link Box}.
	 * 
	 * @param value
	 *            The value to be used.
	 */
	public Box(Payload value) {
		this.value = value;
	}

	/**
	 * Returns the current value this {@link Box}.
	 * 
	 * @return The value.
	 */
	public Payload getValue() {
		return value;
	}

	/**
	 * Sets the current value of this {@link Box}.
	 * 
	 * @param value
	 *            The value to be used.
	 */
	public void setValue(Payload value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}

}

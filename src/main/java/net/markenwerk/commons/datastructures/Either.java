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
 * An {@link Either} is one of two distinct simple immutable container class
 * that holds a single value.
 *
 * @param <Left>
 *            The type of a {@link net.markenwerk.commons.datastructures.Left}
 *            {@link Either}.
 * @param <Right>
 *            The type of a {@link net.markenwerk.commons.datastructures.Right}
 *            {@link Either}.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 * @see net.markenwerk.commons.datastructures.Left
 * @see net.markenwerk.commons.datastructures.Right
 */
@SuppressWarnings("hiding")
public abstract class Either<Left, Right> {

	Either() {
	}

	/**
	 * Returns whether this {@link Either} is a
	 * {@link net.markenwerk.commons.datastructures.Left} {@link Either}.
	 * 
	 * @return If this {@link Either} is a
	 *         {@link net.markenwerk.commons.datastructures.Left} {@link Either}.
	 */
	public abstract boolean isLeft();

	/**
	 * The value of this {@link Either}, if it is a {@link Either#isLeft()}
	 * {@link Either}.
	 * 
	 * @return The value of this {@link Either}.
	 * @throws IllegalStateException
	 *             If this {@link Either} is not a {@link Either#isLeft()}
	 *             {@link Either}.
	 */
	public abstract Left getLeft() throws IllegalStateException;

	/**
	 * Returns whether this {@link Either} is a
	 * {@link net.markenwerk.commons.datastructures.Right} {@link Either}.
	 * 
	 * @return If this {@link Either} is a
	 *         {@link net.markenwerk.commons.datastructures.Right}
	 *         {@link Either}.
	 */
	public abstract boolean isRight();

	/**
	 * The value of this {@link Either}, if it is a {@link Either#isRight()}
	 * {@link Either}.
	 * 
	 * @return The value of this {@link Either}.
	 * @throws IllegalStateException
	 *             If this {@link Either} is not a {@link Either#isRight()}
	 *             {@link Either}.
	 */
	public abstract Right getRight() throws IllegalStateException;

}

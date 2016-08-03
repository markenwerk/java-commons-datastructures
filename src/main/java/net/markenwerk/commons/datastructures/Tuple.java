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
 * A {@link Tuple} is a simple immutable container class that holds two values.
 * 
 * @param <First>
 *            The type of the first value.
 * @param <Second>
 *            The type of the second value.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
public final class Tuple<First, Second> {

	private final First first;

	private final Second second;

	/**
	 * Creates a new {@link Tuple}.
	 * 
	 * @param first
	 *            The first value to be used.
	 * @param second
	 *            The second second to be used.
	 */
	public Tuple(First first, Second second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Returns the first value this {@link Tuple} has been created with.
	 * 
	 * @return The first value.
	 */
	public First getFirst() {
		return first;
	}

	/**
	 * Creates a new {@link Tuple} with the given first value and the second
	 * value from this {@link Tuple}.
	 * 
	 * @param first
	 *            The first value to be used.
	 * @return The created {@link Tuple}.
	 */
	public Tuple<First, Second> withFirst(First first) {
		return new Tuple<First, Second>(first, second);
	}

	/**
	 * Returns the second value this {@link Tuple} has been created with.
	 * 
	 * @return The second value.
	 */
	public Second getSecond() {
		return second;
	}

	/**
	 * Creates a new {@link Tuple} with the given second value and the first
	 * value from this {@link Tuple}.
	 * 
	 * @param second
	 *            The second value to be used.
	 * @return The created {@link Tuple}.
	 */
	public Tuple<First, Second> withSecond(Second second) {
		return new Tuple<First, Second>(first, second);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
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
		Tuple<?, ?> other = (Tuple<?, ?>) object;
		if (first == null && other.first != null || !first.equals(other.first)) {
			return false;
		} else if (second == null && other.second != null || !second.equals(other.second)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tuple [first=" + first + ", second=" + second + "]";
	}

}

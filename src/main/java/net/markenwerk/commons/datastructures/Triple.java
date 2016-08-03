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
 * A {@link Triple} is a simple immutable container class that holds three
 * values.
 * 
 * @param <First>
 *            The type of the first value.
 * @param <Second>
 *            The type of the second value.
 * @param <Third>
 *            The type of the third value.
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
public final class Triple<First, Second, Third> {

	private final First first;

	private final Second second;

	private final Third third;

	/**
	 * Creates a new {@link Triple}.
	 * 
	 * @param first
	 *            The first value to be used.
	 * @param second
	 *            The second second to be used.
	 * @param third
	 *            The third second to be used.
	 */
	public Triple(First first, Second second, Third third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	/**
	 * Returns the first value this {@link Triple} has been created with.
	 * 
	 * @return The first value.
	 */
	public First getFirst() {
		return first;
	}

	/**
	 * Creates a new {@link Triple} with the given first value and the other
	 * values from this {@link Triple}.
	 * 
	 * @param first
	 *            The first value to be used.
	 * @return The created {@link Triple}.
	 */
	public Triple<First, Second, Third> withFirst(First first) {
		return new Triple<First, Second, Third>(first, second, third);
	}

	/**
	 * Returns the second value this {@link Triple} has been created with.
	 * 
	 * @return The second value.
	 */
	public Second getSecond() {
		return second;
	}

	/**
	 * Creates a new {@link Triple} with the given second value and the other
	 * values from this {@link Triple}.
	 * 
	 * @param second
	 *            The second value to be used.
	 * @return The created {@link Triple}.
	 */
	public Triple<First, Second, Third> withSecond(Second second) {
		return new Triple<First, Second, Third>(first, second, third);
	}

	/**
	 * Returns the third value this {@link Triple} has been created with.
	 * 
	 * @return The third value.
	 */
	public Third getThird() {
		return third;
	}

	/**
	 * Creates a new {@link Triple} with the given third value and the other
	 * values from this {@link Triple}.
	 * 
	 * @param third
	 *            The third value to be used.
	 * @return The created {@link Triple}.
	 */
	public Triple<First, Second, Third> withThird(Third third) {
		return new Triple<First, Second, Third>(first, second, third);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		result = prime * result + ((third == null) ? 0 : third.hashCode());
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
		Triple<?, ?, ?> other = (Triple<?, ?, ?>) object;
		if (first == null && other.first != null || !first.equals(other.first)) {
			return false;
		} else if (second == null && other.second != null || !second.equals(other.second)) {
			return false;
		} else if (third == null && other.third != null || !third.equals(other.third)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Triple [first=" + first + ", second=" + second + ", third=" + third + "]";
	}

}

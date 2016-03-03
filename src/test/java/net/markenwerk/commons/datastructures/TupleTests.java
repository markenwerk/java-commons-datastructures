package net.markenwerk.commons.datastructures;

/*
 * Copyright (c) 2015, 2016 Torsten Krause, Markenwerk GmbH
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

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test for {@link Tuple}.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 */
public class TupleTests {

	/**
	 * Retrieve the first value.
	 */
	@Test
	public void getFirst_null() {

		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, null);

		Assert.assertNull(tuple.getFirst());

	}

	/**
	 * Retrieve the first value.
	 */
	@Test
	public void getFirst_nonNull() {

		Object first = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(first, null);

		Assert.assertSame(first, tuple.getFirst());

	}

	/**
	 * Change the first value.
	 */
	@Test
	public void withFirst_changeFirst() {

		Object replacement = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, null).withFirst(replacement);

		Assert.assertSame(replacement, tuple.getFirst());

	}

	/**
	 * Change only the first value.
	 */
	@Test
	public void withFirst_keepSecond() {

		Object second = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, second).withFirst(new Object());

		Assert.assertSame(second, tuple.getSecond());

	}

	/**
	 * Retrieve the second value.
	 */
	@Test
	public void getSecond_null() {

		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, null);

		Assert.assertNull(tuple.getSecond());

	}

	/**
	 * Retrieve the second value.
	 */
	@Test
	public void getSecond_nonNull() {

		Object second = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, second);

		Assert.assertSame(second, tuple.getSecond());

	}

	/**
	 * Change only the second value.
	 */
	@Test
	public void withSecond_keepFirst() {

		Object first = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(first, null).withSecond(new Object());

		Assert.assertSame(first, tuple.getFirst());

	}

	/**
	 * Change the second value.
	 */
	@Test
	public void withSecond_changeSecond() {

		Object replacement = new Object();
		Tuple<Object, Object> tuple = new Tuple<Object, Object>(null, null).withSecond(replacement);

		Assert.assertSame(replacement, tuple.getSecond());

	}

	/**
	 * Equality with same values.
	 */
	@Test
	public void equals_equal() {

		Object first = new Object();
		Object second = new Object();
		Tuple<Object, Object> tuple1 = new Tuple<Object, Object>(first, second);
		Tuple<Object, Object> tuple2 = new Tuple<Object, Object>(first, second);

		Assert.assertEquals(tuple1, tuple2);

	}

	/**
	 * Equality with different first value.
	 */
	@Test
	public void equals_nonEqualFirst() {

		Object second = new Object();
		Tuple<Object, Object> tuple1 = new Tuple<Object, Object>(new Object(), second);
		Tuple<Object, Object> tuple2 = new Tuple<Object, Object>(new Object(), second);

		Assert.assertNotEquals(tuple1, tuple2);

	}

	/**
	 * Equality with different first value.
	 */
	@Test
	public void equals_nonEqualSecond() {

		Object first = new Object();
		Tuple<Object, Object> tuple1 = new Tuple<Object, Object>(first, new Object());
		Tuple<Object, Object> tuple2 = new Tuple<Object, Object>(first, new Object());

		Assert.assertNotEquals(tuple1, tuple2);

	}

}

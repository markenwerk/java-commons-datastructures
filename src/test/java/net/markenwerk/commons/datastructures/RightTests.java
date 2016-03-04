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
package net.markenwerk.commons.datastructures;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test for {@link Left}.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 */
public class RightTests {

	/**
	 * {@link Right} is not left.
	 */
	@Test
	public void isLeft() {

		Either<Object, Object> either = new Right<Object, Object>(null);

		Assert.assertFalse(either.isLeft());

	}

	/**
	 * Get left value.
	 */
	@Test(expected = IllegalStateException.class)
	public void getLeft() {

		Either<Object, Object> either = new Right<Object, Object>(null);

		either.getLeft();

	}

	/**
	 * {@link Right} is right.
	 */
	@Test
	public void isRight() {

		Either<Object, Object> either = new Right<Object, Object>(null);

		Assert.assertTrue(either.isRight());

	}

	/**
	 * Retrieve the right value.
	 */
	@Test
	public void getRight_null() {

		Either<Object, Object> either = new Right<Object, Object>(null);

		Assert.assertNull(either.getRight());

	}

	/**
	 * Retrieve the right value.
	 */
	@Test
	public void getRight_nonNull() {

		Object value = new Object();
		Either<Object, Object> either = new Right<Object, Object>(value);

		Assert.assertSame(value, either.getRight());

	}

	/**
	 * Equality with same value.
	 */
	@Test
	public void equals_equal() {

		Object value = new Object();
		Either<Object, Object> either1 = new Right<Object, Object>(value);
		Either<Object, Object> either2 = new Right<Object, Object>(value);

		Assert.assertEquals(either1, either2);

	}

	/**
	 * Equality with different value.
	 */
	@Test
	public void equals_nonEqual() {

		Either<Object, Object> either1 = new Right<Object, Object>(new Object());
		Either<Object, Object> either2 = new Right<Object, Object>(new Object());

		Assert.assertNotEquals(either1, either2);

	}

}

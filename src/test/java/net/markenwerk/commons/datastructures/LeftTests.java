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

import net.markenwerk.commons.datstructures.Either;
import net.markenwerk.commons.datstructures.Left;

/**
 * JUnit test for {@link Left}.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 */
public class LeftTests {

	/**
	 * {@link Left} is left.
	 */
	@Test
	public void isLeft() {

		Either<Object, Object> either = new Left<Object, Object>(null);

		Assert.assertTrue(either.isLeft());

	}

	/**
	 * Retrieve the left value.
	 */
	@Test
	public void getLeft_null() {

		Either<Object, Object> either = new Left<Object, Object>(null);

		Assert.assertNull(either.getLeft());

	}

	/**
	 * Retrieve the left value.
	 */
	@Test
	public void getLeft_nonNull() {

		Object value = new Object();
		Either<Object, Object> either = new Left<Object, Object>(value);

		Assert.assertSame(value, either.getLeft());

	}

	/**
	 * {@link Left} is not right.
	 */
	@Test
	public void isRight() {

		Either<Object, Object> either = new Left<Object, Object>(null);

		Assert.assertFalse(either.isRight());

	}

	/**
	 * Get right value.
	 */
	@Test(expected = IllegalStateException.class)
	public void getRight() {

		Either<Object, Object> either = new Left<Object, Object>(null);

		either.getRight();

	}

	/**
	 * Equality with same value.
	 */
	@Test
	public void equals_equal() {

		Object value = new Object();
		Either<Object, Object> either1 = new Left<Object, Object>(value);
		Either<Object, Object> either2 = new Left<Object, Object>(value);

		Assert.assertEquals(either1, either2);

	}

	/**
	 * Equality with different value.
	 */
	@Test
	public void equals_nonEqual() {

		Either<Object, Object> either1 = new Left<Object, Object>(new Object());
		Either<Object, Object> either2 = new Left<Object, Object>(new Object());

		Assert.assertNotEquals(either1, either2);

	}

}

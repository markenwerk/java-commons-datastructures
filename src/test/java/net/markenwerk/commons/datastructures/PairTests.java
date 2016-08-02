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

@SuppressWarnings("javadoc")
public class PairTests {

	@Test
	public void getFirst_null() {

		Pair<Object> pair = new Pair<Object>(null, null);

		Assert.assertNull(pair.getFirst());

	}

	@Test
	public void getFirst_nonNull() {

		Object first = new Object();
		Pair<Object> pair = new Pair<Object>(first, null);

		Assert.assertSame(first, pair.getFirst());

	}

	@Test
	public void withFirst_changeFirst() {

		Object replacement = new Object();
		Pair<Object> pair = new Pair<Object>(null, null).withFirst(replacement);

		Assert.assertSame(replacement, pair.getFirst());

	}

	@Test
	public void withFirst_keepSecond() {

		Object second = new Object();
		Pair<Object> pair = new Pair<Object>(null, second).withFirst(new Object());

		Assert.assertSame(second, pair.getSecond());

	}

	@Test
	public void getSecond_null() {

		Pair<Object> pair = new Pair<Object>(null, null);

		Assert.assertNull(pair.getSecond());

	}

	@Test
	public void getSecond_nonNull() {

		Object second = new Object();
		Pair<Object> pair = new Pair<Object>(null, second);

		Assert.assertSame(second, pair.getSecond());

	}

	@Test
	public void withSecond_keepFirst() {

		Object first = new Object();
		Pair<Object> pair = new Pair<Object>(first, null).withSecond(new Object());

		Assert.assertSame(first, pair.getFirst());

	}

	@Test
	public void withSecond_changeSecond() {

		Object replacement = new Object();
		Pair<Object> pair = new Pair<Object>(null, null).withSecond(replacement);

		Assert.assertSame(replacement, pair.getSecond());

	}

	@Test
	public void equals_equal() {

		Object first = new Object();
		Object second = new Object();
		Pair<Object> pair1 = new Pair<Object>(first, second);
		Pair<Object> pair2 = new Pair<Object>(first, second);

		Assert.assertEquals(pair1, pair2);

	}

	@Test
	public void equals_nonEqualFirst() {

		Object second = new Object();
		Pair<Object> pair1 = new Pair<Object>(new Object(), second);
		Pair<Object> pair2 = new Pair<Object>(new Object(), second);

		Assert.assertNotEquals(pair1, pair2);

	}

	@Test
	public void equals_nonEqualSecond() {

		Object first = new Object();
		Pair<Object> pair1 = new Pair<Object>(first, new Object());
		Pair<Object> pair2 = new Pair<Object>(first, new Object());

		Assert.assertNotEquals(pair1, pair2);

	}

}

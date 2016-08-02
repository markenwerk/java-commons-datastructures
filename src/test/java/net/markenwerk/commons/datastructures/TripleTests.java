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
public class TripleTests {

	@Test
	public void getFirst_null() {

		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null);

		Assert.assertNull(triple.getFirst());

	}

	@Test
	public void getFirst_nonNull() {

		Object first = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(first, null, null);

		Assert.assertSame(first, triple.getFirst());

	}

	@Test
	public void withFirst_changeFirst() {

		Object replacement = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null)
				.withFirst(replacement);

		Assert.assertSame(replacement, triple.getFirst());

	}

	@Test
	public void withFirst_keepSecond() {

		Object second = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, second, null)
				.withFirst(new Object());

		Assert.assertSame(second, triple.getSecond());

	}

	@Test
	public void withFirst_keepThird() {

		Object third = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, third)
				.withFirst(new Object());

		Assert.assertSame(third, triple.getThird());

	}

	@Test
	public void getSecond_null() {

		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null);

		Assert.assertNull(triple.getSecond());

	}

	@Test
	public void getSecond_nonNull() {

		Object second = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, second, null);

		Assert.assertSame(second, triple.getSecond());

	}

	@Test
	public void withSecond_keepFirst() {

		Object first = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(first, null, null)
				.withSecond(new Object());

		Assert.assertSame(first, triple.getFirst());

	}

	@Test
	public void withSecond_changeSecond() {

		Object replacement = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null)
				.withSecond(replacement);

		Assert.assertSame(replacement, triple.getSecond());

	}

	@Test
	public void withSecond_keepThird() {

		Object third = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, third)
				.withSecond(new Object());

		Assert.assertSame(third, triple.getThird());

	}

	@Test
	public void getThird_null() {

		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null);

		Assert.assertNull(triple.getThird());

	}

	@Test
	public void getThird_nonNull() {

		Object third = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, third);

		Assert.assertSame(third, triple.getThird());

	}

	@Test
	public void withThird_keepFirst() {

		Object first = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(first, null, null)
				.withThird(new Object());

		Assert.assertSame(first, triple.getFirst());

	}

	@Test
	public void withThird_keepSecond() {

		Object second = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, second, null)
				.withThird(new Object());

		Assert.assertSame(second, triple.getSecond());

	}

	@Test
	public void withThird_changeThird() {

		Object replacement = new Object();
		Triple<Object, Object, Object> triple = new Triple<Object, Object, Object>(null, null, null)
				.withThird(replacement);

		Assert.assertSame(replacement, triple.getThird());

	}

	@Test
	public void equals_equal() {

		Object first = new Object();
		Object second = new Object();
		Object third = new Object();
		Triple<Object, Object, Object> triple1 = new Triple<Object, Object, Object>(first, second, third);
		Triple<Object, Object, Object> triple2 = new Triple<Object, Object, Object>(first, second, third);

		Assert.assertEquals(triple1, triple2);

	}

	@Test
	public void equals_nonEqualFirst() {

		Object second = new Object();
		Object third = new Object();
		Triple<Object, Object, Object> triple1 = new Triple<Object, Object, Object>(new Object(), second, third);
		Triple<Object, Object, Object> triple2 = new Triple<Object, Object, Object>(new Object(), second, third);

		Assert.assertNotEquals(triple1, triple2);

	}

	@Test
	public void equals_nonEqualSecond() {

		Object first = new Object();
		Object third = new Object();
		Triple<Object, Object, Object> triple1 = new Triple<Object, Object, Object>(first, new Object(), third);
		Triple<Object, Object, Object> triple2 = new Triple<Object, Object, Object>(first, new Object(), third);

		Assert.assertNotEquals(triple1, triple2);

	}

	@Test
	public void equals_nonEqualThird() {

		Object first = new Object();
		Object second = new Object();
		Triple<Object, Object, Object> triple1 = new Triple<Object, Object, Object>(first, second, new Object());
		Triple<Object, Object, Object> triple2 = new Triple<Object, Object, Object>(first, second, new Object());

		Assert.assertNotEquals(triple1, triple2);

	}

}

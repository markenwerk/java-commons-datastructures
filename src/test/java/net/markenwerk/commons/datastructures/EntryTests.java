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

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test for {@link Entry}.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 */
public class EntryTests {

	/**
	 * Retrieve the key value.
	 */
	@Test
	public void getKey_null() {

		Entry<Object, Object> entry = new Entry<Object, Object>(null, null);

		Assert.assertNull(entry.getKey());

	}

	/**
	 * Retrieve the key value.
	 */
	@Test
	public void getKey_nonNull() {

		Object key = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(key, null);

		Assert.assertSame(key, entry.getKey());

	}

	/**
	 * Change the key value.
	 */
	@Test
	public void withKey_changeKey() {

		Object replacement = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(null, null).withKey(replacement);

		Assert.assertSame(replacement, entry.getKey());

	}

	/**
	 * Change only the key value.
	 */
	@Test
	public void withKey_keepValue() {

		Object value = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(null, value).withKey(new Object());

		Assert.assertSame(value, entry.getValue());

	}

	/**
	 * Retrieve the value value.
	 */
	@Test
	public void getValue_null() {

		Entry<Object, Object> entry = new Entry<Object, Object>(null, null);

		Assert.assertNull(entry.getValue());

	}

	/**
	 * Retrieve the value value.
	 */
	@Test
	public void getValue_nonNull() {

		Object value = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(null, value);

		Assert.assertSame(value, entry.getValue());

	}

	/**
	 * Change only the value value.
	 */
	@Test
	public void withValue_keepKey() {

		Object key = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(key, null).withValue(new Object());

		Assert.assertSame(key, entry.getKey());

	}

	/**
	 * Change the value value.
	 */
	@Test
	public void withValue_changeValue() {

		Object replacement = new Object();
		Entry<Object, Object> entry = new Entry<Object, Object>(null, null).withValue(replacement);

		Assert.assertSame(replacement, entry.getValue());

	}

	/**
	 * Equality with same values.
	 */
	@Test
	public void equals_equal() {

		Object key = new Object();
		Object value = new Object();
		Entry<Object, Object> entry1 = new Entry<Object, Object>(key, value);
		Entry<Object, Object> entry2 = new Entry<Object, Object>(key, value);

		Assert.assertEquals(entry1, entry2);

	}

	/**
	 * Equality with different key value.
	 */
	@Test
	public void equals_nonEqualKey() {

		Object value = new Object();
		Entry<Object, Object> entry1 = new Entry<Object, Object>(new Object(), value);
		Entry<Object, Object> entry2 = new Entry<Object, Object>(new Object(), value);

		Assert.assertNotEquals(entry1, entry2);

	}

	/**
	 * Equality with different key value.
	 */
	@Test
	public void equals_nonEqualValue() {

		Object key = new Object();
		Entry<Object, Object> entry1 = new Entry<Object, Object>(key, new Object());
		Entry<Object, Object> entry2 = new Entry<Object, Object>(key, new Object());

		Assert.assertNotEquals(entry1, entry2);

	}

}

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
 * JUnit test for {@link Box}.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 */
public class BoxTests {

	/**
	 * Create with {@literal null}.
	 */
	@Test
	public void create_null() {

		Box<Object> box = new Box<Object>();

		Assert.assertNull(box.getValue());

	}

	/**
	 * Create the value.
	 */
	@Test
	public void create_nonNull() {

		Object value = new Object();
		Box<Object> box = new Box<Object>(value);

		Assert.assertSame(value, box.getValue());

	}

	/**
	 * Update value to {@literal null}.
	 */
	@Test
	public void setvalue_null() {

		Box<Object> box = new Box<Object>(new Object());

		box.setValue(null);

		Assert.assertNull(box.getValue());

	}

	/**
	 * Update value to other value.
	 */
	@Test
	public void setValue_nonNull() {

		Object value = new Object();
		Box<Object> box = new Box<Object>(new Object());

		box.setValue(value);

		Assert.assertSame(value, box.getValue());

	}

}
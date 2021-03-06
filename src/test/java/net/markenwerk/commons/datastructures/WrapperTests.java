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
public class WrapperTests {

	@Test
	public void getValue_null() {

		Wrapper<Object> wrapper = new Wrapper<Object>(null);

		Assert.assertNull(wrapper.getValue());

	}

	@Test
	public void getValue_nonNull() {

		Object value = new Object();
		Wrapper<Object> wrapper = new Wrapper<Object>(value);

		Assert.assertSame(value, wrapper.getValue());

	}

	@Test
	public void equals_equal() {

		Object value = new Object();
		Wrapper<Object> wrapper1 = new Wrapper<Object>(value);
		Wrapper<Object> wrapper2 = new Wrapper<Object>(value);

		Assert.assertEquals(wrapper1, wrapper2);

	}

	@Test
	public void equals_nonEqual() {

		Wrapper<Object> wrapper1 = new Wrapper<Object>(new Object());
		Wrapper<Object> wrapper2 = new Wrapper<Object>(new Object());

		Assert.assertNotEquals(wrapper1, wrapper2);

	}

}

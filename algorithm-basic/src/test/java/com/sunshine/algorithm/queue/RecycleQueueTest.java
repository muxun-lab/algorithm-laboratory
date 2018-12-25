package com.sunshine.algorithm.queue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-19 19:51
 */
public class RecycleQueueTest {

	private RecycleQueue recycleQueue;

	@Before
	public void constructor() {
		this.recycleQueue = new RecycleQueue(3);
	}

	@Test
	public void testIsEmpty() {
		Assert.assertEquals(true, this.recycleQueue.isEmpty());
	}

	@Test
	public void testIsFull() {
		Assert.assertEquals(false, this.recycleQueue.isFull());
	}

	@Test
	public void testEnqueue() {
		Assert.assertEquals(true, this.recycleQueue.enQueue(1));
		Assert.assertEquals(true, this.recycleQueue.enQueue(2));
		Assert.assertEquals(true, this.recycleQueue.enQueue(3));
		Assert.assertEquals(false, this.recycleQueue.enQueue(4));
		Assert.assertEquals(3, this.recycleQueue.Rear());
		Assert.assertEquals(true, this.recycleQueue.isFull());
		Assert.assertEquals(true, this.recycleQueue.deQueue());
		Assert.assertEquals(true, this.recycleQueue.enQueue(4));
		Assert.assertEquals(4, this.recycleQueue.Rear());
	}

	@After
	public void print() {

	}
}

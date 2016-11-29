package de.moritz.upperbuchstabe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	private Queue queue;
	
	@Before 
	public void erzeugeQueue(){
		queue = new Queue(3);
		
	}
	
	
	@Test(expected=IllegalArgumentException.class, timeout=1000)
	public void queueTest() {
		new Queue(0);
	}
	
	 @Test(expected=IllegalStateException.class, timeout=1000)
	 public void dequeueTest() {
		 queue.dequeue();
	
	 }

	
	@Test
	public void enqueue_dequeueTest() {
		int para1 =1,para2 =2,para3 =3;
		queue.enqueue(para1);
		queue.enqueue(para2);
		queue.enqueue(para3);
	
		assertEquals(para1, queue.dequeue());
		assertEquals(para2, queue.dequeue());
		assertEquals(para3, queue.dequeue());
		
	}
	
	
	
	@Test
	public void enqueue_dequeue_ringTest() {
		int para1 =1,para2 =2,para3 =3;
		queue.enqueue(para1+10);
		queue.enqueue(para2+10);
		queue.enqueue(para3+10);
		queue.enqueue(para1);
		queue.enqueue(para2);
		queue.enqueue(para3);
	
		assertEquals(para1+10, queue.dequeue());
		assertEquals(para2+10, queue.dequeue());
		assertEquals(para3, queue.dequeue());
		
	}
	


}

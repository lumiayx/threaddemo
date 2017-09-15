package com.yx.threaddemo.maipiao;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThread t1 = new MyThread();
		
		MyRunable r = new MyRunable();
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		//t.start();
		//t1.start();
	}
}

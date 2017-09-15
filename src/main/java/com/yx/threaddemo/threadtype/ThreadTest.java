package com.yx.threaddemo.threadtype;

public class ThreadTest {
	public static void main(String[] args) {
		
		//->避免点继承的局限，一个类可以继承多个接口。
		//->适合于资源的共享
		MyThread t = new MyThread("t");
		MyThread t1 = new MyThread("t1");

		Thread r = new Thread(new MyRunable("r"));
		Thread r1 = new Thread(new MyRunable("r1"));
		
		Thread r2 = new Thread(t);
		Thread r3 = new Thread(t);

		//t.start();
		//t1.start();

		//r.start();
		//r1.start();
		
		r2.start();// extend
		r3.start();
	}
}

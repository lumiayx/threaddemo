package com.yx.threaddemo.threadtype;

public class MyThread extends Thread {

	private String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("extends Thread 线程开始:" + this.name + "-->" + i);
		}
	}

}

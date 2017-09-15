package com.yx.threaddemo.threadtype;

public class MyRunable implements Runnable {

	private String name;

	public MyRunable(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("implement runnable 线程开始:" + this.name + "-->" + i);
		}
	}

}

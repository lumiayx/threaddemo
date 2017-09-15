package com.yx.threaddemo.maipiao;

public class MyRunable implements Runnable {

	private int ticket = 10;

	public void run() {

		doSomething();
	}

	private synchronized void doSomething() {
		for (int i = 0; i < 20; i++) {
			if (this.ticket > 0) {
				System.out.println("卖票：ticket" + this.ticket--);
			}
		}

	}
}

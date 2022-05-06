package com.b.classicalthread.ex1;

public class C_CreatingThread_AnnInner {
	
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("it is job of the threads");
			}
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
	}

}

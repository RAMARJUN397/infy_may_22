package com.b.classicalthread.ex1;

public class D_CreatingThread_Lamabda {

	public static void main(String[] args) {
		
		Runnable runnable =() ->System.out.println("it is job of the threads");
			
		Thread thread = new Thread(runnable);
		thread.start();
	}

}

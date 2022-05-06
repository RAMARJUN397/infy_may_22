package com.b.classicalthread.ex1;

class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("job of the threads..."+Thread.currentThread().getName());
	}
}
public class B_CreatingThread_Runnable {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" started ");
		MyJob job=new MyJob();
		
		Thread thread=new Thread(job, "A");
		thread.start();
		
		Thread thread2=new Thread(job, "B");
		thread2.start();
		
		//can i gurantee main should finish at end
		try {
			thread.join();//hey main thread finish after me
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end ");
	}

}

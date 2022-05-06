package com.b.classicalthread.ex1;
//Job and worker analogy
class MyThread extends Thread{
	public void run() {
		System.out.println("logic to be ex by threads");
	}
}
public class A_CreatingThread_Extending_Thread_Class {
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
	}

}

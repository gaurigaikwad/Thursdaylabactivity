//program to show priority of a thread
package com.question5;

public class ThreadPriorityExample extends Thread{
	public void run()
	{
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		ThreadPriorityExample t1=new ThreadPriorityExample();
		ThreadPriorityExample t2=new ThreadPriorityExample();
		
		System.out.println("default proiority :"+t1.getPriority());
		System.out.println("default proiority :"+t2.getPriority());
		t1.start();
		t2.start();
	}

}

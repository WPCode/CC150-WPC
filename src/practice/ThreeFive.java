package practice;

import myLibrary.MyQueue;

public class ThreeFive {
	
	/*
		Implement a MyQueue class which implements a queue using two stacks.
	*/

	public static void main(String[] args){
		
		MyQueue mq = new MyQueue(10, 10);
		
		for(int i=0;i<10;i++){
			mq.enqueue(i);
			System.out.println(i);
		}
		
		for(int i=0;i<10;i++){
			System.out.println(mq.dequeue());
		}
		
	}

}
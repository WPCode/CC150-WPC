package practice;

import java.util.Arrays;
import java.util.Stack;

public class ThreeTwo {
	
	/*
		How would you design a stack which, in addition to push and pop, also has a function
		min which returns the minimum element? Push, pop and min should all operate in
		O(1) time.
	*/
	static int SIZE = 20;
	static int[] arr = new int[SIZE];
	static int pointer = -1;
	static Stack<Integer> minStack = new Stack<Integer>();
	
	static void push(int data){
		if(data < min()){
			minStack.push(data);
		}
		pointer++;
		arr[pointer] = data;
	}
	
	static int pop(){
		
		int value = arr[pointer];
		if(value==min()){
			minStack.pop();
		}
		arr[pointer] = 0;
		pointer--;
		return value;
	}
	
	static int min(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return minStack.peek();
		}
	}
	
	public static void main(String[] args){

		ThreeTwo stack = new ThreeTwo();
		System.out.println(Arrays.toString(arr));
		System.out.println(stack.minStack);

		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		System.out.println(Arrays.toString(arr));
		System.out.println(stack.minStack);

		stack.pop();
		stack.pop();
		System.out.println(Arrays.toString(arr));
		System.out.println(stack.minStack);

		stack.push(1);
		System.out.println(Arrays.toString(arr));
		System.out.println(stack.minStack);


	}
}
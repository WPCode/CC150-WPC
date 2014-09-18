package practice;

import java.util.Arrays;

public class ThreeOne {
	
	/*
		Describe how you could use a single array to implement three stacks.
	*/

	static int SIZE = 30;
	static int[] array = new int[SIZE];
	
	// [0, SIZE/3)
	// [SIZE/3, SIZE*2/3)
	// [SIZE*2/3, SIZE)
	static int[] stackPointer = {-1, SIZE/3-1, SIZE*2/3-1};

	static void push(int stackNum, int data){
		int index = stackPointer[stackNum]+1;
		array[index] = data;
		stackPointer[stackNum]++;
	}
	
	static int pop(int stackNum){
		int index = stackPointer[stackNum];
		int value = array[index];
		array[index] = 0;
		stackPointer[stackNum]--;
		return value;
	}
	
	static int peek(int stackNum){
		int index = stackPointer[stackNum];
		return array[index];
	}
	
	public static void main(String[] args){
		
		ThreeOne.push(0, 20);
		ThreeOne.push(1, 32);

		ThreeOne.push(2, 99);
		ThreeOne.push(1, 33);

		System.out.println(Arrays.toString(ThreeOne.array));
		
		ThreeOne.pop(0);
		ThreeOne.pop(1);
		
		System.out.println(Arrays.toString(ThreeOne.array));
		System.out.println(ThreeOne.peek(2));

		
	}
	
}
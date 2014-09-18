package practice;
import java.util.ArrayList;
import java.util.Arrays;

import myLibrary.SetOfStacks;
import myLibrary.Stack;

public class ThreeThree {
	
	/*
		Imagine a (literal) stack of plates. If the stack gets too high, it might topple. There-
		fore, in real life, we would likely start a new stack when the previous stack exceeds
		some threshold. Implement a data structure SetOfStacks that mimics this. SetOf-
		Stacks should be composed of several stacks, and should create a new stack once
		the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
		behave identically to a single stack (that is, pop() should return the same values as it
		would if there were just a single stack).
		FOLLOW UP
		Implement a function popAt(int index) which performs a pop operation on a specific
		sub-stack.
	*/
	
	public static void main(String[] args){

		SetOfStacks stacks = new SetOfStacks(5);
		
		for (int i = 1; i < 34; i++) {
			stacks.push(i);
			printStacks(stacks);
		}
		for (int i = 1; i < 9; i++) {
			
			System.out.println("Popped " + stacks.popAt(3));
			printStacks(stacks);

		}	
		
	}

	private static void printStacks(SetOfStacks stacks) {
		// TODO Auto-generated method stub
		ArrayList<Stack> s = stacks.stacks;

		for(int i=0;i<s.size();i++){
			System.out.println(Arrays.toString(s.get(i).data));
		}
	}
}



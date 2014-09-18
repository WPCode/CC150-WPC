package practice;

import myLibrary.Stack;

public class ThreeSix {
	
	/*
		Write a program to sort a stack in ascending order. You should not make any assump-
		tions about how the stack is implemented. The following are the only functions that
		should be used to write this program: push | pop | peek | isEmpty.
	*/

	public static void main(String[] args){
		
		Stack s = new Stack(10); 
		
		int[] a = {3,1,7,5,6,2,4,9,8,7};
		for(int i=0;i<a.length;i++){
			s.push(a[i]);
		}
		
		Stack t = sortStack(s);
		
		while(!t.isEmpty()){
			System.out.print(t.pop() + "  ");
		}
	}

	private static Stack sortStack(Stack s) {

		Stack t = new Stack(s.capacity);
		
		while(!s.isEmpty()){
			
			int temp = s.pop();
			
			while(!t.isEmpty()&&(temp<t.peek())){
				s.push(t.pop());
			}
			
			t.push(temp);
		}
		return t;
	}
}
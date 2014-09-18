package myLibrary;

public class Stack{
	
	public int capacity;
	public int pointer;
	public int[] data;
	
	public Stack(int c){
		this.capacity = c;
		this.data = new int[c];
		this.pointer = -1;
	}
	
	public void push(int d){
		data[++pointer] = d;
	}
	
	public int peek(){
		
		return data[pointer];
	}
	
	public int pop(){
		int top = data[pointer];
		data[pointer--] = 0;
		return top;
	}
	
	public boolean isFull(){
		return pointer == capacity-1;
	}
	
	public boolean isEmpty() { 
		return pointer == -1;
	}

	
}
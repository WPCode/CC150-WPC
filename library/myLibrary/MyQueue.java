package myLibrary;

public class MyQueue{
	
	public Stack s1;
	public Stack s2;
	
	public MyQueue(int c1, int c2){
		s1 = new Stack(c1);
		s2 = new Stack(c2);
	}
	
	public void enqueue(int n){
		s1.push(n);
	}
	
	public int dequeue(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		int i = s2.pop();
	
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		
		return i;
	}
	
}
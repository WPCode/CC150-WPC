package myLibrary;

import java.util.ArrayList;

public class SetOfStacks{
	
	public ArrayList<Stack> stacks;
	public int capacity;
	
	public SetOfStacks(int c){
		this.capacity = c;
		stacks = new ArrayList<Stack>();
	}

	public Stack getLastStack() {
		if(stacks.size()==0){
			return null;
		}else{
			return stacks.get(stacks.size()-1); 
		}
	}
	
	public void push(int data){
		Stack last = getLastStack();
		if((last != null) && (!last.isFull())){
			last.push(data);
		}else{
			Stack s = new Stack(capacity);
			s.push(data);
			stacks.add(s);
		}
	}
	
	public int pop(){
		Stack last = getLastStack();
		int i = last.pop();
		if(last.isEmpty()){
			stacks.remove(stacks.size()-1);
		}
		return i;
	}
	
	public int popAt(int index){
		int a;

		if(index > stacks.size()-1){
			return -1;
		}else{
			Stack s = stacks.get(index);
			a = s.pop();
			if(s.isEmpty()){
				for(int i=index;i<stacks.size()-1;i++){
					stacks.set(i, stacks.get(i+1));
				}
				stacks.remove(stacks.size()-1);
			}
		}

		return a;
	}
	
}
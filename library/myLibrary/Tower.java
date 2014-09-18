package myLibrary;
import java.util.Stack;

public class Tower{
	
	public Stack<Integer> disks;
	public int index;
	
	public Tower(int i){
		this.disks = new Stack<Integer>();
		this.index = i;
	}
	
	public int index(){
		return index;
	}
	
	public void add(int i){
		if(!disks.isEmpty()&& (i>=disks.peek())){
			System.out.println("Error placing disk");
		}else{
			disks.push(i);
		}
	}
	
	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
	}
	
	public void moveDisks(int n, Tower to, Tower buffer){
		
		if(n>0){
			moveDisks(n-1, buffer, to);
			moveTopTo(to);
			buffer.moveDisks(n-1, to, this);
		}
	}
	
	
}
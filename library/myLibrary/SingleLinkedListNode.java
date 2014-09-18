package myLibrary;

public class SingleLinkedListNode {
	
	public SingleLinkedListNode next;
	public int data;
	public SingleLinkedListNode(int data, SingleLinkedListNode n){
		this.data = data;
		this.next = n;
	}
	
	public int getElement(){
		return data;
	}
	
	public SingleLinkedListNode getNext(){
		return next;
	}
	
	public void setNext(SingleLinkedListNode newNext){
		next = newNext;
	}

}
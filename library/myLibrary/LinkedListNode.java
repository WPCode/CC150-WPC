package myLibrary;

public class LinkedListNode {
	
	public LinkedListNode prev;
	public LinkedListNode next;
	public int data;
	public LinkedListNode(int data, LinkedListNode p, LinkedListNode n){
		this.data = data;
		this.prev = p;
		this.next = n;
	}
	
	public int getElement(){
		return data;
	}
	
	public LinkedListNode getNext(){
		return next;
	}
	
	public LinkedListNode getPrev(){
		return prev;
	}
	
	public void setNext(LinkedListNode newNext){
		next = newNext;
		newNext.prev = this;
	}
	
	public void setPrev(LinkedListNode newPrev){
		prev = newPrev;
		newPrev.next = this;
	}

}
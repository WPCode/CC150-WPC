package myLibrary;

public class SingleLinkedListStringNode {
	
	public SingleLinkedListStringNode next;
	public String data;
	public SingleLinkedListStringNode(String data, SingleLinkedListStringNode n){
		this.data = data;
		this.next = n;
	}
	
	public String getElement(){
		return data;
	}
	
	public SingleLinkedListStringNode getNext(){
		return next;
	}
	
	public void setNext(SingleLinkedListStringNode newNext){
		next = newNext;
	}

}
package practice;

import java.util.HashMap;
import java.util.Random;

import myLibrary.LinkedListNode;
import myLibrary.MyMethods;

public class TwoOne {
	
	//Write code to remove duplicates from an unsorted linked list.
	//FOLLOW UP
	//How would you solve this problem if a temporary buffer is not allowed?
	
	private static void deleteDups(LinkedListNode root) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		LinkedListNode current = root;
		while(current != null ){
			if(map.containsKey(current.data)){
				LinkedListNode prev = current.getPrev();
				if(current.getNext()!=null)
					prev.setNext(current.getNext());
				//prev.next = current.next;
			}else{	
				map.put(current.data, true);
			}
			current = current.getNext();
		}
	}
	
	private static void deleteDups2(LinkedListNode root) {
		// TODO Auto-generated method stub		
		LinkedListNode current = root;

		while(current!=null){
			
			LinkedListNode runner = current;
			
			while(runner.next!=null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			current = current.next;	
		}
	}
	
	public static void main(String[] args) {		
		
		Random rand = new Random();
		
		LinkedListNode root = new LinkedListNode(rand.nextInt(10) + 1, null, null);

		LinkedListNode prev = root;
		
		for(int i = 0; i < 9; i++) {
			int num = rand.nextInt(10) + 1;
			LinkedListNode node = new LinkedListNode(num, null, null);
			prev.setNext(node);
			prev = node;
		}
		
		System.out.print("Original: ");
		MyMethods.printLinkedList(root);
		
		deleteDups2(root);
		System.out.print("DeleDup2: ");
		MyMethods.printLinkedList(root);
		
		//deleteDups2(root);
		//System.out.print("DeleDup2: ");
		//MyMethods.printLinkedList(root);
		
	}




	
}
package practice;

import java.util.Random;

import myLibrary.MyMethods;
import myLibrary.SingleLinkedListNode;

public class TwoTwo {
	
	/*
		Implement an algorithm to find the nth to last element of a singly linked list.
	*/

	public static void main(String[] args){
		SingleLinkedListNode root = new SingleLinkedListNode(3,null);
		createSingleLinkedList(root);
		MyMethods.printSingleLinkedList(root);
		
		int n = 9;
		SingleLinkedListNode node = nToLast(root, n);
		if(node == null){
			System.out.println(node);

		}else{
			System.out.println(node.data);
		}
	}
	
	
	private static SingleLinkedListNode nToLast(SingleLinkedListNode root, int n) {
		// TODO Auto-generated method stub
		
		SingleLinkedListNode start = root;
		SingleLinkedListNode end = root;

		for(int i=0;i<n;i++){
			end = end.next;
			if(end == null){
				return null;
			}
		}
		

		
		while(end.next!=null){
			start = start.next;
			end = end.next;
		}
		
		return start;
	}


	private static void createSingleLinkedList(SingleLinkedListNode root) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		SingleLinkedListNode start = root;
		for(int i=0;i<10;i++){
			SingleLinkedListNode newNode = new SingleLinkedListNode(rand.nextInt(9)+1, null);
			start.setNext(newNode);
			start = newNode;
		}
		root = start;
	}
}
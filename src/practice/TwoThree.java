package practice;

import java.util.Random;

import myLibrary.SingleLinkedListNode;
import myLibrary.MyMethods;


public class TwoThree {
	
	/*
		Implement an algorithm to delete a node in the middle of a single linked list, given
		only access to that node.
		EXAMPLE
		Input: the node ‘c’ from the linked list a->b->c->d->e
		Result: nothing is returned, but the new linked list looks like a->b->d->e

	*/

	public static void main(String[] args){
		SingleLinkedListNode root = new SingleLinkedListNode(3,null);
		createSingleLinkedList(root);
		MyMethods.printSingleLinkedList(root);
		
		System.out.println(root.next.next.next.data);
		//deleteInMiddle(root, root.next);
		deleteInMiddle2(root.next.next);

		MyMethods.printSingleLinkedList(root);

		
	}

	private static void deleteInMiddle2(SingleLinkedListNode node) {
		// TODO Auto-generated method stub
		if(node == null || node.next == null){
			return;
		}
		
		node.data = node.next.data;
		node.next = node.next.next;
		
	}

	private static void deleteInMiddle(SingleLinkedListNode root, SingleLinkedListNode node) {
		// TODO Auto-generated method stub
		System.out.println(root.next.next == node);

		SingleLinkedListNode start = root;
		int num = 0;
		int num2 = 0;
		while(start != null){
			num++;
			start = start.next;
		}
		start = node;
		while(start != null){
			num2++;
			start = start.next;
		}
		start = root;
		for(int i=0;i<(num-num2-1);i++){
			start = start.next;
		}
		start.next = start.next.next;
		root = start;
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
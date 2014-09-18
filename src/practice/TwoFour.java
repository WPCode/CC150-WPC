package practice;

import myLibrary.MyMethods;
import myLibrary.SingleLinkedListNode;

public class TwoFour {
	
	/*
		You have two numbers represented by a linked list, where each node contains a sin-
		gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
		the list. Write a function that adds the two numbers and returns the sum as a linked
		list.
		EXAMPLE
		Input: (3 -> 1 -> 8) + (5 -> 9 -> 2)
		Output: 8 -> 0 -> 8
	*/

	private static SingleLinkedListNode AddNum(SingleLinkedListNode head1,
			SingleLinkedListNode head2) {
		// TODO Auto-generated method stub
		
		int check = 0;

		int value = head1.data + head2.data;
		if(value>9){
			value = value - 10;
			check = 1;
		}
		SingleLinkedListNode root = new SingleLinkedListNode(value, null);
		SingleLinkedListNode node = root;
		
		while(head1.next!=null && head2.next!=null){
			
			int v = head1.next.data + head2.next.data + check;
			if(v>9){
				v = v - 10;
				check = 1;
			}else{
				check = 0;
			}
			SingleLinkedListNode num = new SingleLinkedListNode(v, null);
			node.next = num;
			node = num;
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		while(head1.next!=null){
			int v = head1.next.data + check;
			if(v>9){
				v = v -10;
				check = 1;
			}else{
				check = 0;
			}
			SingleLinkedListNode num = new SingleLinkedListNode(v, null);
			node.next = num;
			node = num;
			head1 = head1.next;

		}
		
		while(head2.next!=null){
			int v = head2.next.data + check;
			if(v>9){
				v = v -10;
				check = 1;
			}else{
				check = 0;
			}
			SingleLinkedListNode num = new SingleLinkedListNode(v, null);
			node.next = num;
			node = num;
			head2 = head2.next;

		}
		
		if(check == 1){
			SingleLinkedListNode num = new SingleLinkedListNode(1, null);
			node.next = num;
		}
		
		return root;
	}
	
	public static void main(String[] args){
		SingleLinkedListNode head1 = new SingleLinkedListNode(5, null);
		SingleLinkedListNode num12 = new SingleLinkedListNode(1, null);
		SingleLinkedListNode num13 = new SingleLinkedListNode(8, null);
		//head1.next = num12;
		//num12.next = num13;

		SingleLinkedListNode head2 = new SingleLinkedListNode(5, null);
		SingleLinkedListNode num22 = new SingleLinkedListNode(9, null);
		SingleLinkedListNode num23 = new SingleLinkedListNode(2, null);
		SingleLinkedListNode num24 = new SingleLinkedListNode(3, null);
		//head2.next = num22;
		num22.next = num23;
		num23.next = num24;

		SingleLinkedListNode root = AddNum(head1, head2);
		MyMethods.printSingleLinkedList(head1);
		MyMethods.printSingleLinkedList(head2);
		MyMethods.printSingleLinkedList(root);

		
	}

}
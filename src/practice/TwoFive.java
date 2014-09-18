package practice;

import myLibrary.MyMethods;
import myLibrary.SingleLinkedListStringNode;

public class TwoFive {
	
	/*
		Given a circular linked list, implement an algorithm which returns node at the begin-
		ning of the loop.
		DEFINITION
		Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
		earlier node, so as to make a loop in the linked list.
		EXAMPLE
		input: A -> B -> C -> D -> E -> C [the same C as earlier]
		output: C


	*/

	public static void main(String[] args){
		
		SingleLinkedListStringNode root = createCircularLinkedList();
		
		SingleLinkedListStringNode start = returnBeginOfLoop(root);
		
		System.out.println(start.data);
		
	}

	private static SingleLinkedListStringNode returnBeginOfLoop(SingleLinkedListStringNode root) {

		SingleLinkedListStringNode na = root;
		SingleLinkedListStringNode nb = root;
		
		while(nb!=null){
			na = na.next;
			nb = nb.next.next;
			if(na == nb){
				break;
			}
		}
		
		if(nb==null) return null;
		
		SingleLinkedListStringNode n = root;
		
		while(n!=nb){
			n=n.next;
			nb=nb.next;
		}
		
		return n;
	}

	private static SingleLinkedListStringNode createCircularLinkedList() {

		SingleLinkedListStringNode root = new SingleLinkedListStringNode("A", null);
		SingleLinkedListStringNode node1 = new SingleLinkedListStringNode("B", null);
		SingleLinkedListStringNode node2 = new SingleLinkedListStringNode("C", null);
		SingleLinkedListStringNode node3 = new SingleLinkedListStringNode("D", null);
		SingleLinkedListStringNode node4 = new SingleLinkedListStringNode("E", null);
		SingleLinkedListStringNode node5 = new SingleLinkedListStringNode("F", null);


		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = root;
		
		return root;
	}

}
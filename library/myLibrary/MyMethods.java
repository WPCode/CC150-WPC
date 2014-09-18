package myLibrary;

public class MyMethods {
	
	public static String toFullBinaryString(int a) {
		String st = "";
		for(int i=0;i<32;i++){
			int b = a&1;
			a = a>>1;
			st = b + st;
		}
		return st;
	}
	
	public static void printLinkedList(LinkedListNode root) {
		LinkedListNode current = root;

		while (current != null) {
			if(current.next == null) {
				System.out.println(current.data);
			}
			else {
				System.out.print(current.data);
				System.out.print("->");	
			}
			current = current.next;
		}
	}
	
	public static void printSingleLinkedList(SingleLinkedListNode root) {
		SingleLinkedListNode current = root;

		while (current != null) {
			if(current.next == null) {
				System.out.println(current.data);
			}
			else {
				System.out.print(current.data);
				System.out.print("->");	
			}
			current = current.next;
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
	public static void printStrMatrix(String[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
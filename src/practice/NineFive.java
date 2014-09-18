package practice;

public class NineFive {
	
	/*
		Given a sorted array of strings which is interspersed with empty strings, write a meth-
		od to find the location of a given string.
		Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
		Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1
	*/

	public static void main(String[] args){

		String[] str1 = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String[] str2 = {"at", "", "", "", "", "ball", "car", "", "", "dad", "", ""};
				
		String goal = "car";
		System.out.println(findLocation(str1, goal, 0, str1.length-1));
		
	}

	private static int findLocation(String[] str, String goal, int i, int j) {

		while(i<=j){
			
			while(str[j]=="") j--;
			
			int mid = (i+j)/2;
	
			while(str[mid]=="") mid++;
			int check = goal.compareTo(str[mid]);
			if(check==0){
				return mid;
			}else if(check<0){
				j=mid-1;
			}else{
				i=mid+1;
			}
			
		}
		return -1;
	}

}
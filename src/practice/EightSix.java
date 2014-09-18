package practice;

import java.util.Random;

import myLibrary.MyMethods;

public class EightSix {
	
	/*
		Implement the “paint fill” function that one might see on many image editing pro-
		   grams. That is, given a screen (represented by a 2 dimensional array of Colors), a
		  point, and a new color, fill in the surrounding area until you hit a border of that col-
		 or.’	
	*/
	
	public static void main(String[] args){
		
		int N = 10;
		String[][] screen = new String[N][N];
		for(int i=0;i<screen.length;i++){
			for(int j=0;j<screen[0].length;j++){
				screen[i][j] = "B";
			}
		}
		Random rand = new Random();
		for(int i=0;i<100;i++){
			screen[rand.nextInt(10)][rand.nextInt(10)] = "G";
		}
		
		MyMethods.printStrMatrix(screen);
		
		int m=2;
		int n=2;
		String oc = screen[m][n];
		PaintFill(screen, m, n, oc,"W");
		
		System.out.println();
		MyMethods.printStrMatrix(screen);

	}



	private static void PaintFill(String[][] screen, int i, int j, String oc, String cc) {

		if(i>=screen.length||i<0||j>=screen[0].length||j<0) return;
		
		if(screen[i][j].equals(oc)){
			screen[i][j] = cc;
			PaintFill(screen, i-1, j, oc, cc);
			PaintFill(screen, i+1, j, oc, cc);
			PaintFill(screen, i, j-1, oc, cc);
			PaintFill(screen, i, j+1, oc, cc);
		}
		return;
	}

}
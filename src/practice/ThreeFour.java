package practice;

import myLibrary.Tower;

public class ThreeFour {
	
	/*
		In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
		sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending
		order of size from top to bottom (e.g., each disk sits on top of an even larger one). You
		have the following constraints:	
		(A) Only one disk can be moved at a time.
		(B) A disk is slid off the top of one rod onto the next rod.
		(C) A disk can only be placed on top of a larger disk.
		Write a program to move the disks from the first rod to the last using Stacks.

	*/

	public static void main(String[] args){

		int n = 5;
		Tower[] towers = new Tower[5];
		for(int i=0;i<3;i++){
			towers[i] = new Tower(i);
		}
		
		for(int i=4;i>=0;i--){
			towers[0].add(i);
		}
		
		towers[0].moveDisks(5, towers[2], towers[1]);
	}

}
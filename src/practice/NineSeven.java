package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import myLibrary.HtWt;

public class NineSeven {
	
	/*
		A circus is designing a tower routine consisting of people standing atop one anoth-
		er’s shoulders. For practical and aesthetic reasons, each person must be both shorter
		 and lighter than the person below him or her. Given the heights and weights of each
		person in the circus, write a method to compute the largest possible number of peo-
		ple in such a tower.
		EXAMPLE:
		Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
		Output: The longest tower is length 6 and includes from top to bottom: (56, 90)
		(60,95) (65,100) (68,110) (70,150) (75,190)

	*/
	static ArrayList<HtWt> items;
	static ArrayList<HtWt> lastFoundSeq;
	static ArrayList<HtWt> maxSeq;

	
	
	public static void main(String[] args){
		
		items = new ArrayList<HtWt>();
		lastFoundSeq = new ArrayList<HtWt>();
		maxSeq = new ArrayList<HtWt>();
		
		HtWt item = new HtWt(55, 100);
		items.add(item);
		
		item = new HtWt(57, 150);
		items.add(item);
		
		item = new HtWt(72, 96);
		items.add(item);
		
		item = new HtWt(75, 190);
		items.add(item);
		
		item = new HtWt(60, 95);
		items.add(item);
		
		item = new HtWt(79, 195);
		items.add(item);
		
		printList(items);
		
		Collections.sort(items);
		System.out.println();
		printList(items);

		findMaxSeq();
		System.out.println();

		printList(maxSeq);

	}
	
	static void findMaxSeq() {
		
		int current = 0;
		maxSeq = new ArrayList<HtWt>();
		
		while(current<items.size()){

			int c = current;
			lastFoundSeq = new ArrayList<HtWt>();

			HtWt comp = items.get(0);
			while(c<items.size()){
				if(c==0){
					lastFoundSeq.add(items.get(c));
				}else if(comp.isBefore(items.get(c))){
					lastFoundSeq.add(items.get(c));
					comp = items.get(c);
				}else{
					comp = items.get(c-1);
				}
				c++;
			}

			if(lastFoundSeq.size()>maxSeq.size()){
				maxSeq = lastFoundSeq;
			}	

			current = c+1;
		}
		
	}
	
	public static void printList(ArrayList<HtWt> list) {
		for (HtWt item : list) {
			System.out.println(item.toString() + " ");
		}
	}
}
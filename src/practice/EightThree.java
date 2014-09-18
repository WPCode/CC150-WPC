package practice;

import java.util.ArrayList;

public class EightThree {
	
	/*
		Write a method that returns all subsets of a set
	*/
	
	public static void main(String[] args){

		int[] set = {1,2,3};
		
		//returnAllSubsets(set);
		
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			set2.add(i);
		}
	
		ArrayList<ArrayList<Integer>> allSet2 = returnAllSubsets2(set2, 0);

		System.out.println(allSet2);
		
	}

	private static ArrayList<ArrayList<Integer>> returnAllSubsets2(ArrayList<Integer> set, int i) {
		ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();

		if(i==set.size()){
			allSubSets = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			allSubSets.add(b);
		}else{
			allSubSets = returnAllSubsets2(set, i+1);
			int item = set.get(i);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();

			for(ArrayList<Integer> s:allSubSets){
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(s);
				newsubset.add(item);
				moresubsets.add(newsubset);

			}
			allSubSets.addAll(moresubsets);

		}
		return allSubSets;
	}

	private static void returnAllSubsets(int[] set) {
		int len = set.length;
		int maxi = (1<<len) - 1;

		for(int i=1;i<=maxi;i++){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for(int j=0;j<len;j++){
				if(((i>>j)&1)==1){
					arr.add(set[j]);
				}
			}
			System.out.println(arr);
		}
	}

}
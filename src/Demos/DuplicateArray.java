package Demos;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr [] = {1,2,3,2,1,3,5,6,5};
		Set <Integer> set = new HashSet<>();
		for(int i:arr) set.add(i);
		System.out.println(set);
		

	}

}

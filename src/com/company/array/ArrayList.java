package com.company.array;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer> arrli = new java.util.ArrayList<Integer>();
		arrli.add(45);
		arrli.add(66);
		arrli.add(645);
		arrli.add(456);
		arrli.add(6745);
		arrli.add(4765);
		arrli.add(456);

		System.out.println(arrli);

		Object[] arr= arrli.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int len = arr.length;
		for(int i= 0; i<len; i++) {
			System.out.println(arr[i]);
		}
		  
	}
}

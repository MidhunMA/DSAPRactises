package com.dsa.main;

import java.util.Arrays;

public class ResizeArray {
	
	public static int[] doResizeArray(int[] arr, int newLength) {
		//creating a new array and adding to it
		int[] temp= new int[newLength];
		int j=0;
		for(int i:arr) {
			temp[j]=i;
			j++;
		}
		arr=temp;//pointing the memory pointer of array
		System.out.println(arr.length);
		return arr;
		
	}

}


package com.dsa.main;

import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr=new int[] {0,5,3,35,0,3,5,3,0};
		System.out.println(Arrays.toString(arr));
		Movezerso.shiftZerosEnd(arr);
		System.out.println(Arrays.toString(arr));
		//Movezerso.shiftZerosToEndEasy(arr);
		ResizeArray.doResizeArray(arr,arr.length*2);
		int[] sequenced=new int[] {1,6,4,3,2};
		System.out.println(MissingNumberInSequenceArray.doMissingNumberInSequenceArray(sequenced));
		System.out.println(StringPalindrom.checkStringPalindrom("Malayalam"));
		

	}

}

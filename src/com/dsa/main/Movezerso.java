package com.dsa.main;

import java.util.Arrays;

public class Movezerso {

	public static int[] shiftZerosEnd(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}

	public static int[] shiftZerosToEndEasy(int[] numbers) {
		int[] result = new int[numbers.length];
		System.out.println(Arrays.toString(result));
		int position = 0;
		for (int val : numbers) {
			if (val != 0) {
				result[position] = val;
				position++;
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

}

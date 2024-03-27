package com.dsa.main;

class MissingNumberInSequenceArray {
	
	public static int doMissingNumberInSequenceArray(int[] arr)
	{
		//array is 0-n , we will find sum of all elements and see how much left if we use full 1-n values,thats the missing number
		int n=arr.length+1;
		int sum=(n*(n+1))/2;
		for (int a:arr )
		{ sum=sum-a;
		}
	return sum;
	}

}

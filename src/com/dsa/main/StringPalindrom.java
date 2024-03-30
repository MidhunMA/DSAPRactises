package com.dsa.main;

public class StringPalindrom {
	
	public static boolean checkStringPalindrom(String str) {
		//converting to char array , then compare letters at start and last
		//for case insensitive comparison changeto string builder and reverse and compare eqals ignre case
		char[] charArr=str.toCharArray();
		int start=0;
		int end=charArr.length-1;
		while(start<end) {
			if (charArr[start]!=charArr[end]) {
				System.out.println("no");
				return false;
			}
			start++;
			end--;
			}
		return true;
		}
			
	}


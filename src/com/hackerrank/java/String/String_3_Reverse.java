package com.hackerrank.java.String;

public class String_3_Reverse {

	public static void main(String[] args) {
		
		String A = "madam";
		boolean flag = true;
		char[] charArray = A.toCharArray();
		
		for(int i = 0; i <= charArray.length/2 ; i ++) {
			
			if(charArray[i] != charArray[charArray.length - i -1]) {
				//System.out.println(charArray[i] + " === " + charArray[charArray.length - i -1]);
				flag = false;
			}
		}
		
		System.out.println(flag? "Yes" : "No");
		
		
	}
}

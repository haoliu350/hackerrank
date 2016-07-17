package com.hackerrank.java.String;

public class String_1_Introduction {

	public static void main(String[] args) {


		String A = "hello";
		String B = "java";
		
		//Find a length of a String
		System.out.println(A.length() + B.length());
		
		//String compare with Alphabeta order
		if(A.compareTo(B) <= 0){
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		//***
		//Upper case of the first letter of a String
		String A2 = A.substring(0, 1).toUpperCase() + A.substring(1);
		String B2 = B.substring(0, 1).toUpperCase() + B.substring(1);
		
		System.out.println(A2 + " " + B2);
		
		
	}

}

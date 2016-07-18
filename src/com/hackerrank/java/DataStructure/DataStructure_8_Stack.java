package com.hackerrank.java.DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class DataStructure_8_Stack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
		while (sc.hasNext()) {
			String input=sc.next();
		    //Complete the code
			
			//Implementation 1
		     while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
		     System.out.println(input.isEmpty());
			
			
		}
		
	}

}

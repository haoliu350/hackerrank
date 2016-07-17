package com.hackerrank.java.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_2_Compare {

	public static void main(String[] args) {

/*		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int length = sc.nextInt();*/
		
		
		System.out.println("welcometojava");
		
		String text = "welcometojava";
		int length = 3;
		
		ArrayList<String> allSubStrings = new ArrayList<String>();
		
		for(int i = 0; i <= text.length() - length; i ++){
			System.out.println(text.substring(i, (i + length)));
			allSubStrings.add(text.substring(i, (i + length)));
			
		}
		
		Collections.sort(allSubStrings);
		System.out.println("result: " + allSubStrings.get(0));
		
	}

}

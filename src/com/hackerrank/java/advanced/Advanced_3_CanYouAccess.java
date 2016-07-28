package com.hackerrank.java.advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;




public class Advanced_3_CanYouAccess {

	public static void main(String[] args) {
		
		//Do_Not_Terminate.forbidExit();	

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num = 0;
			try {
				num = Integer.parseInt(br.readLine().trim());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			
			//write your code here
			o =  new Inner();
			try {
				Method m = Inner.class.getDeclaredMethod("powerof2");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("An instance of class: " + o.getClass().getCanonicalName()+" has been created");


	}//end of main
	
	static class Inner
	{
		private class Private{
			private String powerof2(int num)
			{
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner

}

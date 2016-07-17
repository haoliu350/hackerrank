package com.hackerrank.java.String;
import java.util.regex.Pattern;

public class String_5_Tokens {

	public static void main(String[] args) {
		
		String s = "He is a very very good boy, isn't he?";
		
		String[] tokens = s.trim().split("[ !,?\\._'@]+", 0);
		
		if(tokens.length == 1 && tokens[0].equals("")){
			System.out.println(0);
		} //else if(tokens.length >= 1 && tokens.length <= 400000){
		else{
			System.out.println(tokens.length);
			for(String str : tokens){
				System.out.println(str.trim());
			}
		} 
		
		//Another solution
		
/*		String[] a=cin.nextLine().trim().split("[ !,?\\._'@]+",0);
		if(a.length==1&&a[0].equals("")){
			System.out.println(0);
		}else{
			System.out.println(a.length);
			for(String s:a)System.out.println(s);
		}*/
		
	}

}

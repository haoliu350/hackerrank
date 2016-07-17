package com.hackerrank.java.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_4_Anagrams {

	public static void main(String[] args) {
		
		boolean result = isAnagram("anagram ", "mar gana");
		System.out.println(result? "Anagrams": "Not Anagrams");
		
	}

	public static boolean isAnagram(String a, String b) {
		
/*		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		ArrayList<String> ala = new ArrayList<String>();
		ArrayList<String> alb = new ArrayList<String>();
		for(char c : ca) {
			ala.add((c+"").toLowerCase());
		}
		for(char c : cb) {
			alb.add((c+"").toLowerCase());
		}
		
		Collections.sort(ala);
		Collections.sort(alb);
		
		for(int i = 0 ; i < ala.size() ; i ++){
			if(!ala.get(i).equalsIgnoreCase(alb.get(i))){
				return false;
			}
		}
		
		return true;*/
		
		char ac[] = a.toLowerCase().toCharArray();
		char bc[] = b.toLowerCase().toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		return Arrays.equals(ac, bc);
	}
}

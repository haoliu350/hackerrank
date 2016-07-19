package com.hackerrank.java.util;

import java.util.ArrayList;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {2,3,10,2,4,8,1};
		int a[] = {7,9,5,6,3,2};
		
		System.out.println(maxDifference(a));
		
		String test[]  = missingWords("I am using hackerank to imporve programming","am hackerank to imporve");
		for(String s : test) {
			System.out.println(s);
		}
	}
	
	static int maxDifference(int[] a) {
		int max  = 0;
		for(int i = a.length - 1; i >= 0; i --){
			for(int j = 0 ; j <= i; j ++){
				max = (a[i] - a[i-j]) < max ? max :(a[i] - a[i-j]);
			}
		}
		return max > 0 ? max : -1;
	}
	
    static String[] missingWords(String s, String t) {
        String sarray[] = s.split(" ");
        String tarray[] = t.split(" ");
        
        ArrayList<String> sal =  new ArrayList<>();
        ArrayList<String> tal =  new ArrayList<>();
        
        for(String ss : sarray){
        	sal.add(ss);
        }
        
        for(String tt : tarray){
        	tal.add(tt);
        }
        ArrayList<String> rt =  new ArrayList<>();
        for(String temp : sal){
        	if(!tal.contains(temp)){
        		rt.add(temp);
        	}
        }
        
        String result[] = new String[rt.size()];
        for(int i = 0; i < rt.size(); i ++){
        	result[i] = rt.get(i);
        }

        return result;
    }

}

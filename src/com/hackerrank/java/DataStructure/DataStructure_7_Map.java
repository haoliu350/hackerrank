package com.hackerrank.java.DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataStructure_7_Map {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map map = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         
	         map.put(name, phone);
	         
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         Integer phone = (Integer) map.get(s);
	         if(phone != null) {
	        	 System.out.println(s+"="+map.get(s));
	         }else{
	        	 System.out.println("Not found");
	         }
	      }

	}

}

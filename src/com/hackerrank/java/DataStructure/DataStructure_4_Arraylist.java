package com.hackerrank.java.DataStructure;

/*
 * 
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line. 

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross 100000.

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
 * 
 * 
 * */
import java.util.ArrayList;
import java.util.Scanner;


public class DataStructure_4_Arraylist {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    int d,q,x,y;
		    ArrayList[] set = new ArrayList[n];
		    for(int i=0;i<n;i++){
		        d = in.nextInt();
		        set[i] = new ArrayList();
		        for(int j=0;j<d;j++){  
		            set[i].add(in.nextInt());                
		        }
		    }
		    q=in.nextInt();
		    for(int i=0;i<q;i++){
		        x=in.nextInt();
		        y=in.nextInt();
		        try{
		            System.out.println(set[x-1].get(y-1));
		        } catch(Exception e){
		            System.out.println("ERROR!");
		        }
		    }
		
		
		
	}

}

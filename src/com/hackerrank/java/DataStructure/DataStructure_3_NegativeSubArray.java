package com.hackerrank.java.DataStructure;
import java.util.Scanner;

public class DataStructure_3_NegativeSubArray {

	public static void main(String[] args) {
		
/*		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int input[] = new int[n]; 
	    for(int i = 0 ; i < n; i++){
			  int val = sc.nextInt();
			  input[i] = val;
		}*/
	    
	    //mock input
	    int m = 5;
	    int[] input2 = {1, -2, 4, -5, 1};
	    
	    int count = 0;
	    for(int j = 0; j < m; j ++){
	    	
	    	int sum = 0;
	    	for(int i = j ; i < m; i ++){
	    		sum += input2[i];
	    		if(sum < 0){
	    			count ++;
	    		}
	    	}
	    }
	    System.out.println(count);
	}

}

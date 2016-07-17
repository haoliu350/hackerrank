package com.hackerrank.java.BigNumber;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigNumber_2_BigDecimal {

	public static void main(String[] args) {

		//mock input
		String s[] = {"9","-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
		
		//Input
/*        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []s = new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }*/
        
		/*ArrayList<BigDecimal> arr = new ArrayList<>();
		for(int i = 0; i < s.length ; i++){
			arr.add(new BigDecimal(s[i])) ;
		}
		Collections.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < arr.size() ; i ++){
			s[i] = arr.get(i).toString();
		}*/
		
        
		//Implementation 1
		//
		//
		//
        //write your code here
/*		for (int i = n; i >=0; i--){
	          for (int j = 0; j < i - 1; j++){
	              if (isAscending(s[j],s[j+1])){
	                  swap(j,j+1,s);
	              }
	          }
	      }*/
		
		
		//Implementation 2
		//
		//
		//
		Arrays.sort(s, Collections.reverseOrder(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				BigDecimal bd1 = new BigDecimal(o1);
				BigDecimal bd2 = new BigDecimal(o2);
				return bd1.compareTo(bd2);
			}
			
		}));
		
		
		
		
		//Output
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
	}
	
	private static boolean isAscending (String s1, String s2){
        BigDecimal bigD1 = new BigDecimal(s1);
        BigDecimal bigD2 = new BigDecimal(s2);
        return bigD1.compareTo(bigD2)==-1;
    }
    
    private static void swap (int i, int j, String[] s) {
        String temp;
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}

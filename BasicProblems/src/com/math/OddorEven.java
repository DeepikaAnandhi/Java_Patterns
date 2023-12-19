package com.math;

public class OddorEven {
	
	
	public static void main(String[] args) {
		int x = 101;
		
		System.out.println(findOddOrEven(x));
		
		
	}

	private static String findOddOrEven(int x) {
		
//		  if(x%2==0) { 
//			  System.out.println("Given Number is Even"); 
//		  }else {
//			  System.out.println("Given Number is Odd"); 
//		  }
//		 
		
		return (x%2==0? "even":"odd");
		
	}

}

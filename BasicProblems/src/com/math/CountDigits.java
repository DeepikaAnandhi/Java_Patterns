package com.math;

public class CountDigits {
	
	
	public static void main(String[] args) {
		int x = 101234;
		int y =98;
		
		System.out.println(findDigits(98));
		
		
	}

	private static int findDigits(int x) {
		int last = x%10;
		System.out.println(last);
		int c=1;

		while(last>=10) {
			last = last%10;
			System.out.println(last);
			c = c+1;
		}
		
		return c;
	}

}

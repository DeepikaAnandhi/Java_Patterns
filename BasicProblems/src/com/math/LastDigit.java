package com.math;

public class LastDigit {
	
	
	public static void main(String[] args) {
		int x = 5957687;
		
		int lastDigit = findLastDigit(x);
		System.out.println(lastDigit);
		
	}

	private static int findLastDigit(int x) {
		
		int last = x%10;
		
		while(last>=10) {
			last = last%10;
		}
		
		return last;
		
	}

}

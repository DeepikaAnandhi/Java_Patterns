package com.patterns;

public class NumberChangingPyramid {

	
	
	public static void main(String[] args) {
		createPattern(4);
		
	}

	private static void createPattern(int n) {
		
		int count =0;
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(++count);
			}
			System.out.println();
			
		}
		
	}
}

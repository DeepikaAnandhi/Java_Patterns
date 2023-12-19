package com.patterns;

public class NumberIncreacingPyramid {

	
	
	public static void main(String[] args) {
		createPattern(4);
		
	}

	private static void createPattern(int n) {
		
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}
}

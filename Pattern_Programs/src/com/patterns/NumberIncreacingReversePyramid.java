package com.patterns;

public class NumberIncreacingReversePyramid {

	
	
	private static void createPattern(int n) {
		
		
		for(int i =1;i<=n;i++) {
			int z=1;
			for(int j=n;j>=i;j--) {
				System.out.print(z);
				z++;
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		createPattern(4);
		
	}
}

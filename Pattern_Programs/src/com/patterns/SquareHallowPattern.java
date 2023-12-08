package com.patterns;

import java.util.Scanner;

public class SquareHallowPattern {

	public static void createPattern(int row, int col) {
		
			
		for(int i=0;i<row;i++) {				
			for(int j=0;j<col;j++) {
				if(i==0 ||i==row-1||j==0 || j==col-1) {
					System.out.print("x");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the no of Rows: ");
		int row = in.nextInt();
		System.out.print("Enter the no of Columns: ");
		int col = in.nextInt();
		
		createPattern(row,col);
		
		
	}
	
	
}

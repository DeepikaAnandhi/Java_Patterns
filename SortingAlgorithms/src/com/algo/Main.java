package com.algo;

public class Main {

	public static void main(String[] args) {
		int[] arr = {3,1,9,4,2,6,8,5};
		printArray(arr);
		//BubbleSort.createBubbleSort(arr);
		//SelectionSort.selectionSort(arr);
		//InsertionSort.insertionSort(arr);
		printArray(arr);
	}

	static void  printArray(int[] arr) {
		for(int b:arr) {
			System.out.print(b + " ");
		}
		System.out.println();
			
	}

	
}

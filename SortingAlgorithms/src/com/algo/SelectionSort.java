package com.algo;

public class SelectionSort {

	
	//int[] arr = {3,1,9,4,2};
	
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex =i;
			
			for (int j = i+1; j < arr.length; j++) {				
//Finding the minimum number in remaining numbers	
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
//after found the min number shuffle with corresponding index
			if(minIndex!=i) {
				int temp =arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
			
		}
		
	}
}

package eda2.ordenation.algorithms;

public class BubbleSort {
	
	public int[] sortByBubbleSort(int[] array){
		
		int auxiliarSwapVariable;
		for(int i=0;i<array.length;i++){
			// Swap higher values to the end of the array into this loop
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					auxiliarSwapVariable = array[j+1];
					array[j+1] = array[j];
					array[j] = auxiliarSwapVariable;
				} else {
					// Do nothing
				}
			}
		}
		return array;
	}

}

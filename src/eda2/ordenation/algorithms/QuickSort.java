package eda2.ordenation.algorithms;

public class QuickSort {

	
	public static int[] sortByQuickSort(int[] array, int start, int end){
		
		int pivot = end; //Pivot as a position of array
		int high= pivot-1; // Higher value as a position of array
		int low=start; // Lower value as a position of array
		int auxiliarSwap; 
		int pivotPositionAtEnd;
		
		System.out.println("------------------------");
		System.out.println("Valores ANTES do while: ");
		System.out.println("PIVOT: " + pivot);
		System.out.println("LOW: " + low);
		System.out.println("HIGH: " + high);
		
		// Walking through the array with the lower pointer
		while(array[low]>array[pivot] && low != high){
			low++;
		}
		
		// Walking through the array with the higher pointer
		while(array[high]<array[pivot] && high != low){
			high--;
		}
		
		System.out.println("Valores DEPOIS do while: ");
		System.out.println("PIVOT: " + pivot);
		System.out.println("LOW: " + low);
		System.out.println("HIGH: " + high);
		
		if(array[low] > array[high]){
			// Swap operation between low and high
			auxiliarSwap = array[low];
			array[low] = array[high];
			array[high] = auxiliarSwap;
		} else {
			// Pointers are at equal element, if the element pointed is higher than the pivot, swap then
			if(array[low] > array[pivot]){
				auxiliarSwap = array[low];
				array[low] = array[pivot];
				array[pivot] = auxiliarSwap;
			} else {
				// Do nothing
			}
			
		}
		
		pivotPositionAtEnd = low;
		array = sortByQuickSort(array, start, pivotPositionAtEnd);
		array = sortByQuickSort(array, pivotPositionAtEnd+1, end);
		
		return array;
	}
	
}

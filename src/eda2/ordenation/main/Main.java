package eda2.ordenation.main;

import java.util.Scanner;

import eda2.ordenation.algorithms.BubbleSort;
import eda2.ordenation.algorithms.InsertionSort;
import eda2.ordenation.algorithms.MergeSort;
import eda2.ordenation.algorithms.QuickSort;
import eda2.ordenation.algorithms.SelectionSort;
import eda2.ordenation.algorithms.ShellSort;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Choose wich algorithm you want to use for sorting the array");
		scanner = new Scanner(System.in);
		int algorithm = scanner.nextInt();
		
		int unorderedArray[] = { 76,6,3,2,11,1,-5, 1,2,88,-23,37,-22,45,10,41,24,91,-11,50};
		int orderedArray[];
		switch (algorithm) {
			
			// Selection Sort
			case 1: {
				orderedArray = SelectionSort.sortBySelection(unorderedArray);
				printResult(orderedArray);
			} break;
			// Insertion Sort
			case 2: {
				orderedArray = InsertionSort.sortByInsertionSort(unorderedArray);
				printResult(orderedArray);
			} break;
			// Bubble Sort
			case 3: {
				orderedArray = BubbleSort.sortByBubbleSort(unorderedArray);
				printResult(orderedArray);
			} break;
			case 4: {
				orderedArray = ShellSort.sortByShellSort(unorderedArray);
				printResult(orderedArray);
			}break;
			case 5: {
				orderedArray = QuickSort.sortByQuickSort(unorderedArray, 0, unorderedArray.length-1);
				printResult(orderedArray);
			} break;
			case 6:
				orderedArray = MergeSort.sortByMergeSort(unorderedArray, 0, unorderedArray.length-1);
				printResult(orderedArray);
			
		}
	}
	
	private static void printResult(int[] orderedArray){
		for(int i=0;i<orderedArray.length;i++ ){
			System.out.println(orderedArray[i]);
		}
		
		if(sortChecker(orderedArray)){
			System.out.println("Ordenação Realizada com sucesso");
		}else {
			System.out.println("Existe(m) elemento(s) desordenado no array.");
		}
	}
	
	private static boolean sortChecker(int[] array){
		boolean isCorrectedSorted = true;
		
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				isCorrectedSorted = false;
				break;
			} else {
				// Do nothing
			}
			
		}
		
		return isCorrectedSorted;
	}

}

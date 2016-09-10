package eda2.ordenation.main;

import java.util.Scanner;

import eda2.ordenation.algorithms.BubbleSort;
import eda2.ordenation.algorithms.InsertionSort;
import eda2.ordenation.algorithms.SelectionSort;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Choose wich algorithm you want to use for sorting the array");
		scanner = new Scanner(System.in);
		int algorithm = scanner.nextInt();
		
		int unorderedArray[] = { 35603,6,3,2,11,1,-5};
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
			}
		}
	}
	
	private static void printResult(int[] orderedArray){
		for(int i=0;i<orderedArray.length;i++ ){
			System.out.println(orderedArray[i]);
		}
	}

}

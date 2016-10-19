package eda2.ordenation.algorithms;

public abstract class MergeSort {

	public static int[] sortByMergeSort(int[] array, int firstElement, int lastElement) {

		// Array have to be ordered by recursive merge sort
		if (lastElement > firstElement) {
			// Founding middle element
			int middleElement = (firstElement + lastElement) / 2;

			// Recursively merge sort two halves of array
			sortByMergeSort(array, firstElement, middleElement);
			sortByMergeSort(array, (middleElement + 1), lastElement);
			mergeArrays(array, firstElement, middleElement+1, lastElement);
		}
		// Array is already sorted by default
		else {
			// Do nothing
		}

		return array;
	}

	static public int[] mergeArrays(int[] array, int firstElement, int middleElement, int lastElement) {
		int[] auxiliarArray = new int[array.length];
		int leftArrayEnd, arraySize, temporaryPosition;

		leftArrayEnd = (middleElement - 1);
		temporaryPosition = firstElement;
		arraySize = (lastElement - firstElement + 1);

		while ((firstElement <= leftArrayEnd) && (middleElement <= lastElement)) {
			if (array[firstElement] <= array[middleElement]) {
				auxiliarArray[temporaryPosition] = array[firstElement];
				temporaryPosition++;
				firstElement++;
			}
			else {
				auxiliarArray[temporaryPosition++] = array[middleElement++];
			}
		}

		while (firstElement <= leftArrayEnd)
			auxiliarArray[temporaryPosition++] = array[firstElement++];

		while (middleElement <= lastElement)
			auxiliarArray[temporaryPosition++] = array[middleElement++];

		for (int i = 0; i < arraySize; i++) {
			array[lastElement] = auxiliarArray[lastElement];
			lastElement--;
		}
		return auxiliarArray;
	}

}

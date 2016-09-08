package eda2.ordenation.algorithms;

public class SelectionSort {

	public int[] sortBySelection(int[] array) {

		int minorValue;
		int position;
		int auxiliar;

		for (int i = 0; i < array.length; i++) {
			minorValue = array[i];
			position=i;
			/* This internal loop gets the minorValue for each interaction into
			the array*/
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[j] < minorValue) {
					minorValue = array[j];
					position = j;
				} else {
					// Do nothing
				}
			}
			// This operation swaps the selected element with the minor value
			auxiliar = array[i];
			array[i] = array[position];
			array[position] = auxiliar;
			
			

		}
		return array;
	}

}

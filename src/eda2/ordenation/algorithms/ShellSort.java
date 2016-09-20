package eda2.ordenation.algorithms;

public abstract class ShellSort {

	public static int[] sortByShellSort(int[] array) {

		int gap = array.length / 2;
		int selectedElement;
		int j;
		System.out.println("Tamanho do array: " + array.length);
		while (gap > 0) {
			System.out.println(" valor do gap: "+ gap);
			for (int i = gap; i < array.length; i++) {
				j=i;
				selectedElement = array[i];
				while(j>=gap && array[j-gap] > selectedElement){
					array[j] = array[j-gap];
					j = j - gap;
				}
				array[j] = selectedElement;
			}
			gap = gap / 2;
		}

		return array;
	}
}

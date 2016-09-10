package eda2.ordenation.algorithms;

public abstract class InsertionSort {

	public static int[] sortByInsertionSort(int[] array){
		
		int selectedElement;
		
		/*Iterate the array starting for second position and then compare his previous
		 positions. Elements higher than the selected moves 1 position foward. */
		for(int i=1; i<array.length;i++){
			selectedElement = array[i];
			/*Iterate from 0 position until the selected moving foward in 1 position 
			higher elements*/
			for(int j=(i-1); j>=0; j--){
				if(array[j]>selectedElement){
					array[j+1] = array[j];
					array[j] = selectedElement;
				} else{
					// Do nothing
				}
				
			}
		}
		
		return array;
	}
}

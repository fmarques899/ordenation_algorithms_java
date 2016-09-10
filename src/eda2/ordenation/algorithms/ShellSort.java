package eda2.ordenation.algorithms;

public abstract class ShellSort {

	public static int[] sortByShellSort(int[] array){
		
		final int half = array.length / 2;
		int auxiliarSwap;
		int jumper = half;
		
		/*This will separate the array into groups and applies Selection Sort into 
		 * those groups.
		 * Each loop decreases into half the value of the 'jumper', and it will 
		 * make more groups for each iteraction*/
		while(jumper >  0){
			
			for(int i=0 ; i+jumper<array.length ; i++){
				if(array[i]>array[i+jumper]){
					auxiliarSwap = array[i+jumper];
					array[i+jumper] = array[i];
					array[i] = auxiliarSwap;
				} else {
					// Do Nothing
				}
			}
		jumper = jumper /2;
		
		}
		
		return array;
	}
}

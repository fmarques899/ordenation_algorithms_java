package eda2.ordenation.algorithms;

public abstract class ShellSort {

	public static int[] sortByShellSort(int[] array){
		
		final int half = array.length / 2;
		int auxiliarSwap;
		int jumper = half;
		System.out.println("Valor do jumper: " + jumper);
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
		System.out.println("Valor do jumper: " + jumper);
		}
		
		return array;
	}
}

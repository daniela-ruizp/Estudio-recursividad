package es.upm.aled.factorial;

import java.util.Arrays;

public class bubbleRecur {

	public void bubbleRecur(int[] array, int j) {
		for(int i=0;i<array.length-1-j;i++) {
			bubbleApoyo(array,i);
		}
		if(j<array.length-1)
			bubbleRecur(array,j+1);
	}
	
	
	/*public void bubbleRecur(int[] array, int i, int j) {
		if (i < array.length - 1-j) {
			bubbleApoyo(array, i);
			bubbleRecur(array, i + 1, j);
		} else if (j < array.length - 1)
			bubbleRecur(array, 0, j + 1);
	}
	*/

	private void bubbleApoyo(int[] array, int posicion) {
		if (array[posicion] > array[posicion + 1]) {
			int aux = array[posicion];
			array[posicion] = array[posicion + 1];
			array[posicion + 1] = aux;
		}
	}

	public static void main(String[] args) {
		bubbleRecur b = new bubbleRecur();
		int[] array = { 3, 6, 4, 2, 7, 8, 5, 15, 13, 25, 27, 75, 103, 47,38, 79};
		b.bubbleRecur(array, 0);
		for (int i : array) {
			System.out.println(i);
		}
	}


	
}



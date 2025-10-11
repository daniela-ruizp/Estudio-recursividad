package es.upm.aled.factorial;

public class bubbleRecur {

	public void bubbleRecur(int[] array) {
		bubbleRecur(array,0);

	}

	private void bubbleRecur(int[] array, int posicion) {
		do {
			if (array[posicion] < array[posicion+1])
				posicion = posicion+2;
			else if (array[posicion] >= array[posicion+1]) {
				int aux = array[posicion];
				array[posicion] = array[posicion+1];
				array[posicion+1] = aux;
				posicion=posicion+2;

			}
		} while (posicion < array.length);
	}
}

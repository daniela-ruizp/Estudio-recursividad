package es.upm.aled.factorial;

public class SumArray {
	
	public static int sumArray(int[] array) throws Exception {
		return sumArray(array,0); 
	}	
	private static int sumArray(int[]array, int posicion) {
		if (posicion==array.length-1)
			return array[posicion];
		return array[posicion]+sumArray(array,posicion+1);
	}

	public static void main(String[] args) throws Exception{
		int[] array= {1,2,3,4,5,6};
		int resultado= sumArray(array); 
		System.out.println(resultado);
	}

}

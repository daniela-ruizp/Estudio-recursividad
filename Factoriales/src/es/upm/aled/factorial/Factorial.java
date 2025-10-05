package es.upm.aled.factorial;

public class Factorial {

public static int factorial (int n) throws Exception{
	if (n<0)
		throw new Exception ("No existen los factoriales para números negativos"); 
	if (n==1||n==0)
		return 1; 
	return (n*factorial(n-1));
}

public static void main(String[]args)throws Exception {
 int n= 7; 
 System.out.println("El factorial de " + n +" es: "+ factorial(n));
}
}

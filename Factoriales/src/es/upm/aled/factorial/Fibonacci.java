package es.upm.aled.factorial;

public class Fibonacci {
	
	public int fibonacci (int n) throws Exception {
		if (n<0)
			throw new Exception("Se ha introducido un número negativo"); 
		//Caso base 
		if (n==0) 
			return 0;
		else if (n==1) 
				return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

public static void main (String[] args) throws Exception{ 
	Fibonacci f= new Fibonacci(); 
	System.out.println(f.fibonacci(25));
	
}
}

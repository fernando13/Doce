package fizzBuzz;
 
public class FizzBuzz {
	
	public static String[] create() {
		String[] a = new String[100];
		String aux;
		for(int i = 1; i <= 100; i++){
			aux = String.valueOf(i);
			if(i % 3 == 0){ aux = "Fizz";}
			if(i % 5 == 0){ aux = "Buzz";}
			if((i % 3 == 0) && (i % 5 == 0)){aux = "FizzBuzz";}
			a[i-1] = aux;
		}
		return a;
	}
}


package primeFactors;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
	
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int candidate = 2; i > 1; candidate++){
			for(;i % candidate == 0; i /= candidate){
				primes.add(candidate);
			}
		}
		return primes;
	}

}
//EclEmma  cobertura 

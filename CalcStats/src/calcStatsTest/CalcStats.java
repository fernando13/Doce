package calcStatsTest;

import java.util.Collections;
import java.util.List;

public class CalcStats {

	public static int promedio(List<Integer> lista) {
		int prom = 0;
		for(int i = 0; i < lista.size(); i++){
			prom += lista.get(i);
		}
		return (prom / lista.size()) ;
	}

	public static int cantidad(List<Integer> lista) {
		return lista.size();
	}

	public static int minimo(List<Integer> lista) {
		Collections.sort(lista);
		return lista.get(0);
	}

	public static int maximo(List<Integer> lista) {
		Collections.sort(lista);
		return lista.get((lista.size()-1));
	}

	
}

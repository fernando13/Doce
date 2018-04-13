package calcStatsTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class CalcStatsTest {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);	
	}	
	
	@Test
	public void testProm() {
		int prom = CalcStats.promedio(list(8,10));
		assertEquals(9, prom);
	}
	
	@Test
	public void testProm2() throws Exception {
		int prom = CalcStats.promedio(list(5));
		assertEquals(5, prom);
	}
	
	@Test
	public void testCant() throws Exception {
		int cant = CalcStats.cantidad(list());
		assertEquals(0, cant);
	}
	
	@Test
	public void testCant2() throws Exception {
		int cant = CalcStats.cantidad(list(1,2,5,8));
		assertEquals(4, cant);	
	}
	
	@Test
	public void testMin() throws Exception {
		int min = CalcStats.minimo(list(2,4,1,8));
		assertEquals(1, min);
	}
	
	@Test
	public void testMax() throws Exception {
		int max = CalcStats.maximo(list(2,8,1,3));
		assertEquals(8, max);
	}
	

}

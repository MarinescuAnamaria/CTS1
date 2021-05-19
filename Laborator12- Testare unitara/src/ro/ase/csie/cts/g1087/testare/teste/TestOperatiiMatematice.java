package ro.ase.csie.cts.g1087.testare.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1087.testare.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.cts.g1087.testare.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("salut");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("pa");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("preg test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("sterge resurse folosite");
	}

	@Test
	public void test() {
		System.out.println("Test de test");
		fail("Not yet implemented");
	}
	@Test
    public void testAdunareValoriPozitive() {
		System.out.println("test aduna");
    	int a=5;
		int b=5;
		int rezultatasteptat=10;
		int rezultatcalculat=OperatiiMatematice.aduna(a, b);
		
		assertEquals("Suma cu numere pozitive", rezultatasteptat, rezultatcalculat);
    }
	
	@Test
	public void testImpartireValoriPozitive() {
		int a=1;
		int b=2;
		double rezultatasteptat=0.5;
		double rezultatcalculat=0;
		try {
			rezultatcalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			
			fail("Am primit exceptie desi nu trebuia");
		}
		
		assertEquals("Impartire 1/2", rezultatasteptat, rezultatcalculat, 0);
	}
}

package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	private AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Mercedes");

		assertEquals("Mercedes", a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratkoIme() {
		a.setMarkaModel("VW");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);

		assertEquals(15, a.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(10);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVece() {
		a.setPrecnik(123);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(200);

		assertEquals(200, a.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(0);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVece() {
		a.setSirina(800);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);

		assertEquals(50, a.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(10);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVise() {
		a.setVisina(96);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Mercedes");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(95);

		assertEquals("AutoGuma [markaModel=Mercedes, precnik=15, sirina=200, visina=95]", a.toString());
	}

	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Mercedes");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(95);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Mercedes");
		a2.setPrecnik(15);
		a2.setSirina(200);
		a2.setVisina(95);

		assertTrue(a.equals(a2));
	}

	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Mercedes");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(95);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("BMW");
		a2.setPrecnik(18);
		a2.setSirina(200);
		a2.setVisina(80);

		assertFalse(a.equals(a2));
	}

}

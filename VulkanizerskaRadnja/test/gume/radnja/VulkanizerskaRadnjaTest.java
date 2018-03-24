package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja v;
	private AutoGuma a;
	private AutoGuma b;
	private AutoGuma c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		b = new AutoGuma();
		c = new AutoGuma();

		a.setMarkaModel("Mercedes");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(95);

		b.setMarkaModel("Mercedes");
		b.setPrecnik(20);
		b.setSirina(200);
		b.setVisina(95);

		c.setMarkaModel("Audi");
		c.setPrecnik(20);
		c.setSirina(300);
		c.setVisina(95);
	}

	@After
	public void tearDown() throws Exception {
		v = null;
	}

	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);
		v.dodajGumu(b);
		v.dodajGumu(c);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		v.dodajGumu(a);
		v.dodajGumu(a);
	}

	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNemaNijedna() {
		v.dodajGumu(a);
		v.dodajGumu(b);

		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();

		assertEquals(novaLista, v.pronadjiGumu("Volvo"));
	}

	@Test
	public void testPronadjiGumuSamoJedna() {
		v.dodajGumu(a);
		v.dodajGumu(c);

		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		novaLista.add(c);

		assertEquals(novaLista, v.pronadjiGumu("Audi"));

	}

	@Test
	public void testPronadjiGumuViseRazlicitih() {
		v.dodajGumu(a);
		v.dodajGumu(b);
		v.dodajGumu(c);

		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		novaLista.add(b);
		novaLista.add(a);

		assertEquals(novaLista, v.pronadjiGumu("Mercedes"));
	}

}

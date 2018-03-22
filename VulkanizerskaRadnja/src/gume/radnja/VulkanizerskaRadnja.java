package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * 
 * @author Milena Petrovic
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista guma automobila
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu na pocetak liste gume.
	 * 
	 * @param a objekat klase AutoGuma
	 * @throws java.lang.RuntimeException ako je unet:
	 * <ul>
	 *		<li>null</li>
	 *		<li>objekat koji vec postoji u listi guma</li>
	 * </ul>
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi i vraca gumu po nazivu marke modela.
	 * 
	 * @param markaModel naziv marke modela koji se trazi
	 * @return
	 * <ul>
	 *		<li>null, ako je uneta marka modela null</li>
	 *		<li>novaLista, u suprotnom</li>
	 * </ul>
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		/**
		 * 	Lista guma u koju se dodaju samo gume iz liste gume koje su trazene po nazivu marke modela.
		 */
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}

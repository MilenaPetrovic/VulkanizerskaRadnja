package gume;

/**
 * Klasa koja predstavlja gumu automobila.
 * 
 * @author Milena Petrovic
 * @version 1.0
 * 
 */

public class AutoGuma {
	
	/**
	 * Marka modela
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca marku modela.
	 * @return marku modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja novu vrednost marke modela.
	 * 
	 * @param markaModel nova vrednost za marku modela
	 * @throws java.lang.RuntimeException ako je unet:
	 * <ul> 
	 * 
	 * <li>null String</li>
	 * 
	 * <li>String manji od 3 karaktera</li>
	 * 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume.
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost precnika gume.
	 * 
	 * @param precnik nova vrednost za precnik gume
	 * @throws java.lang.RuntimeException ako je unet precnik:
	 *  <ul> 
	 * 
	 * <li>manji od 13</li>
	 * 
	 * <li>veci od 22</li>
	 * 
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	
	/**
	 * Vraca sirinu gume.
	 * @return sirinu gume kao int
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja novu vrednost sirine gume.
	 * 
	 * @param sirina nova vrednost za sirinu gume
	 * @throws java.lang.RuntimeException ako je uneta sirina:
	 * <ul> 
	 * 
	 * <li>manja od 135</li>
	 * 
	 * <li>veca od 355</li>
	 * 
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume
	 * @return visinu gume kao int
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja novu vrednost visine gume.
	 * 
	 * @param visina nova vrednost za visinu gume
	 * @throws java.lang.RuntimeException ako je uneta visina:
	 * <ul> 
	 * 
	 * <li>manja od 25</li>
	 * 
	 * <li>veca od 95</li>
	 * 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}

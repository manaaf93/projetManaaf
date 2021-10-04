package projetBD;

import java.sql.Date;

public class Acte {
	
	public int id_akt;
	public int id_hospitalisation;
	public int id_ccam;
	public Date ddreal ;
	public int anesth;
	
	//Constructeurs
	/**
	 * @param id_akt
	 * @param id_hospitalisation
	 * @param id_ccam
	 * @param ddreal
	 * @param anesth
	 */
	public Acte(int id_akt, int id_hospitalisation, int id_ccam, Date ddreal, int anesth) {
		super();
		this.id_akt = id_akt;
		this.id_hospitalisation = id_hospitalisation;
		this.id_ccam = id_ccam;
		this.ddreal = ddreal;
		this.anesth = anesth;
	}
	/**
	 * @return the id_akt
	 */
	public int getId_akt() {
		return id_akt;
	}
	/**
	 * @param id_akt the id_akt to set
	 */
	public void setId_akt(int id_akt) {
		this.id_akt = id_akt;
	}
	/**
	 * @return the id_hospitalisation
	 */
	public int getId_hospitalisation() {
		return id_hospitalisation;
	}
	/**
	 * @param id_hospitalisation the id_hospitalisation to set
	 */
	public void setId_hospitalisation(int id_hospitalisation) {
		this.id_hospitalisation = id_hospitalisation;
	}
	/**
	 * @return the id_ccam
	 */
	public int getId_ccam() {
		return id_ccam;
	}
	/**
	 * @param id_ccam the id_ccam to set
	 */
	public void setId_ccam(int id_ccam) {
		this.id_ccam = id_ccam;
	}
	/**
	 * @return the ddreal
	 */
	public Date getDdreal() {
		return ddreal;
	}
	/**
	 * @param ddreal the ddreal to set
	 */
	public void setDdreal(Date ddreal) {
		this.ddreal = ddreal;
	}
	/**
	 * @return the anesth
	 */
	public int getAnesth() {
		return anesth;
	}
	/**
	 * @param anesth the anesth to set
	 */
	public void setAnesth(int anesth) {
		this.anesth = anesth;
	}
	
	

}

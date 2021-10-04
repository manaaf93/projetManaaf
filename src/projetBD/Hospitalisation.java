package projetBD;

import java.sql.Date;

public class Hospitalisation {
	public int id_hospitalisation;
	public int id_patient;
	public Date dde ;
	public Date dds;
	
	//Constructeurs
	/**
	 * @param id_hospitalisation
	 * @param id_patient
	 * @param dde
	 * @param dds
	 */
	public Hospitalisation(int id_hospitalisation, int id_patient, Date dde, Date dds) {
		super();
		this.id_hospitalisation = id_hospitalisation;
		this.id_patient = id_patient;
		this.dde = dde;
		this.dds = dds;
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
	 * @return the id_patient
	 */
	public int getId_patient() {
		return id_patient;
	}
	/**
	 * @param id_patient the id_patient to set
	 */
	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}
	/**
	 * @return the dde
	 */
	public Date getDde() {
		return dde;
	}
	/**
	 * @param dde the dde to set
	 */
	public void setDde(Date dde) {
		this.dde = dde;
	}
	/**
	 * @return the dds
	 */
	public Date getDds() {
		return dds;
	}
	/**
	 * @param dds the dds to set
	 */
	public void setDds(Date dds) {
		this.dds = dds;
	}

	
}

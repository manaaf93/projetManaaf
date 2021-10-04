package projetBD;

import java.sql.Date;

public class Diagnostic {
	private int id_diagnostic;
	private int id_hospitalisation;
	private char code_cim10 ;
	private String dgtype;
	
	
	// Constructeurs
	/**
	 * @param id_diagnostic
	 * @param id_hospitalisation
	 * @param code_cim10
	 * @param dgtype
	 */
	public Diagnostic(int id_diagnostic, int id_hospitalisation, char code_cim10, String dgtype) {
		super();
		this.id_diagnostic = id_diagnostic;
		this.id_hospitalisation = id_hospitalisation;
		this.code_cim10 = code_cim10;
		this.dgtype = dgtype;
	}
	/**
	 * @return the id_diagnostic
	 */
	public int getId_diagnostic() {
		return id_diagnostic;
	}
	/**
	 * @param id_diagnostic the id_diagnostic to set
	 */
	public void setId_diagnostic(int id_diagnostic) {
		this.id_diagnostic = id_diagnostic;
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
	 * @return the code_cim10
	 */
	public char getCode_cim10() {
		return code_cim10;
	}
	/**
	 * @param code_cim10 the code_cim10 to set
	 */
	public void setCode_cim10(char code_cim10) {
		this.code_cim10 = code_cim10;
	}
	/**
	 * @return the dgtype
	 */
	public String getDgtype() {
		return dgtype;
	}
	/**
	 * @param dgtype the dgtype to set
	 */
	public void setDgtype(String dgtype) {
		this.dgtype = dgtype;
	}
	@Override
	public String toString() {
		return "Diagnostic [id_diagnostic=" + id_diagnostic + ", id_hospitalisation=" + id_hospitalisation
				+ ", code_cim10=" + code_cim10 + ", dgtype=" + dgtype + "]";
	}

	
}

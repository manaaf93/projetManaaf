package projetBD;
import java.sql.Date;
import java.util.ArrayList;

public class Patient {
	private int id_patient;
	private String nom;
	private String prenom;
	private int sexe;
	private ArrayList<Diagnostic> diagnostic =new ArrayList<Diagnostic>();
	private ArrayList<Acte> acte =new ArrayList<Acte>();
	private Date ddn;

	// Constructeurs
	
	/**
	 * @param id_patient
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param ddn
	 * @param diagnostic
	 * @param acte
	 */
	public Patient(int id_patient, String nom, String prenom, int sexe,
			ArrayList<projetBD.Diagnostic> diagnostic, ArrayList<projetBD.Acte> acte) {
		this.id_patient = id_patient;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		ArrayList<Diagnostic> Diagnostic = diagnostic;
		ArrayList<Acte> Acte = acte;
	}
	
	
	/**
	 * @param id_patient
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param ddn
	 */
	public Patient(int id_patient, String nom, String prenom, int sexe, Date ddn) {
		super();
		this.id_patient = id_patient;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.ddn = ddn;
	}


	public Patient() {
		// TODO Auto-generated constructor stub
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the sexe
	 */
	public int getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(int sexe) {
		this.sexe = sexe;
	}
	/**
	 * @return the ddn
	 */
	public Date getDdn() {
		return ddn;
	}
	/**
	 * @param ddn the ddn to set
	 */
	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}
	public ArrayList<Diagnostic> getDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(ArrayList<Diagnostic> diagnostic) {
		diagnostic = diagnostic;
	}
	/**
	 * @return the acte
	 */
	public ArrayList<Acte> getActe() {
		return acte;
	}
	/**
	 * @param acte the acte to set
	 */
	public void setActe(ArrayList<Acte> acte) {
		acte = acte;
	}

	public void setDate_naissance(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setSexe(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Patient [id_patient=" + id_patient + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", ddn="
				+ ddn + "]";
	}

	public void setDiagnostic(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	


	}

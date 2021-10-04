package projetBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Methode {
	
	/*static final String DB_URL = "jdbc:mysql://localhost:3307/test";

	static final String USER = "manaaf";

	static final String PASS = "MAN17,ouro";*/


	static Scanner scanner = new Scanner(System.in);
	
	private static Scanner scanner1 = new Scanner(System.in);


	
	public static void Donnees() {
		// Open a connection
		
		System.out.println(" Veuiller entrez l'identifiant du patient");

		int id = scanner.nextInt();
		
		String QUERY = "Select id_patient, NOM, PRENOM,SEXE, DATE_NAISSANCE  from tab_patient "
				+ "where id_patient = " + id ;
		
		try {
			Connection connect = ConnectionJDBC.getConnection();

			Statement stmt = connect.createStatement();
    	
		ResultSet rs = stmt.executeQuery(QUERY);

		  while(rs.next()) {
			  
			  	int identifiant = rs.getInt("id_patient");
				String NAME = rs.getString("NOM");
				String PRENOM = rs.getString("PRENOM");
				int SEXE = rs.getInt("SEXE");
				Date DDN = rs.getDate("DATE_NAISSANCE");

				System.out.println("ID:" + identifiant + " Nom: " + NAME + " Prénom: " + PRENOM + " Sexe: " + SEXE
						+ " Ddn:" + DDN);
			}
	
			} catch (SQLException e) {
					e.printStackTrace();
			}
	}

	public static void Sejour() {
		// Open a connection

			
				
				System.out.println(" Veuiller entrez l'identifiant du patient");
				
				int id = scanner.nextInt();
				
				String QUERY = "SELECT  NOM, PRENOM, SEXE, datediff(date_sortie,date_entree) as DureeSejour, tab_patient.id_patient \r\n"
						+ "FROM tab_hospitalisation\r\n"
						+ "inner join tab_patient on tab_patient.id_patient = tab_hospitalisation.id_patient \n"
						+ "where tab_patient.id_patient = " + id + "\n"
						+ " order by DureeSejour DESC";
				
				try {Connection connect = ConnectionJDBC.getConnection();
					
					Statement stmt = connect.createStatement();

				ResultSet rs = stmt.executeQuery(QUERY); 

			// Extract data from result set

			while (rs.next()) {

				// Retrieve by column name

				int identifiant = rs.getInt("id_patient");
				String NAME = rs.getString("NOM");
				String PRENOM = rs.getString("PRENOM");
				int SEXE = rs.getInt("SEXE");
				int DureeSejour = rs.getInt("DureeSejour");

				System.out.println("ID:" + identifiant + " Nom: " + NAME + " Prénom: " + PRENOM + " Sexe: " + SEXE
						+ " DureeSejour:" + DureeSejour);
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	
	
	public static void NbActe() {
		// Open a connection

				
				System.out.println(" Veuillez entrez l'identifiant du patient");
				
				int id = scanner1.nextInt();
				
				String QUERY = "select tab_patient.id_patient, count(ID_AKT) as NbreActe, NOM, PRENOM from tab_patient \n" 
						+"inner join tab_hospitalisation on tab_patient.ID_PATIENT = tab_hospitalisation.ID_PATIENT \n" 
						+"inner join tab_acte on tab_hospitalisation.ID_HOSPITALISATION = tab_acte.ID_HOSPITALISATION \n"
						+ "where tab_patient.id_patient = " + id;
					
				try {
					Connection connect = ConnectionJDBC.getConnection();

				Statement stmt = connect.createStatement();

				ResultSet rs = stmt.executeQuery(QUERY); 

			// Extract data from result set

			while (rs.next()) {

				// Retrieve by column name

				int identifiant = rs.getInt("id_patient");
				String NAME = rs.getString("NOM");
				String PRENOM = rs.getString("PRENOM");
				int NbreActe = rs.getInt("NbreActe");

				System.out.println("ID:" + identifiant + " Nom: " + NAME + " Prénom: " + PRENOM 
						+ " NbreActe:" + NbreActe);
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void TrouverDiagnostic() {
		// Open a connection
				
				System.out.println(" Veuiller entrez l'identifiant du patient");
				
				int id = scanner1.nextInt();
				
				String QUERY = "select tab_patient.ID_PATIENT, NOM, PRENOM, LIBELLE_CIM110 from tab_patient \r\n"
						+ "inner join tab_hospitalisation on tab_patient.ID_PATIENT = tab_hospitalisation.ID_PATIENT \r\n"
						+ "inner join tab_diagnostic on tab_hospitalisation.ID_HOSPITALISATION = tab_diagnostic.ID_HOSPITALISATION \n"
						+"inner join tab_cim10 on CODE_CIM10 = ID_CIM10\r\n"
						+ "where tab_patient.id_patient = " + id;
						
					
					

				try {
					Connection connect = ConnectionJDBC.getConnection();

				Statement stmt = connect.createStatement();

				ResultSet rs = stmt.executeQuery(QUERY); 

			// Extract data from result set

			while (rs.next()) {

				// Retrieve by column name

				int identifiant = rs.getInt("id_patient");
				String NAME = rs.getString("NOM");
				String PRENOM = rs.getString("PRENOM");
				String NomDiag = rs.getString("LIBELLE_CIM110");

				System.out.println("ID:" + identifiant + " Nom: " + NAME + " Prénom: " + PRENOM 
						+ " Nom du diagnostic:" + NomDiag) ;
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}

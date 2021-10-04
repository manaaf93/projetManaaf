package projetBD;
import java.util.Scanner;

public class Menu extends Methode {
	
	static int p;
	static Scanner scanner = new Scanner(System.in);
	ConnectionJDBC conn = new ConnectionJDBC(); 
public static void Projet() {
	getChoixUtilisateur();
	
}
public static int getChoixUtilisateur() {
	System.out.println(" ------------------------------------------------------ ");
	System.out.println("|                                                      |");
	System.out.println("|                GESTION DES DONNEES                   |");
	System.out.println("|                       DU PMSI                        |");
	System.out.println("|                                                      |");
	System.out.println(" -----------------------------------------------------\n");

	
	System.out.println("----------MENU D'AFFICHAGE DE L'APPLICATION---------------- \n"
			
			+ "1- AFFICHER LES DONNEES DU PATIENT. \n" 
			+ "2- AFFICHER LES DIFFERENTS SEJOUR DU PATIENT.\n"
			+ "3- AFFICHER LE NOMBRE D'ACTE D'UN PATIENT.\n"
			+ "4- TROUVER LE DIAGNOSTIC D'UN PATIENT.\n"
			+ "5- QUITTER L'APPLICATION.\n ");
	
	return scanner.nextInt();
}

public static void Choix() {
	
	
	while(true) {
		int p = getChoixUtilisateur();
	switch (p) {
	
	case 1 : {
		//System.out.println(" Veuiller entrez l'identifiant du patient");
		Methode.Donnees(); 
	//System.out.println("Voulez vous afficher les données d'un autre patient?[O|N]!");
	//String choice = scanner.next();
	
		//while ("O".equals (choice)) {Methode.Donnees();}
		
		//while ("N".equals(choice)) {int s = getChoixUtilisateur(); Choix(s);}
	
		//if (!"N".equals(choice) && !"O".equals(choice) ) {System.out.println("Saisie incorrecte!");
	//int s = getChoixUtilisateur(); Choix(s);}
	
	break;
	}
	 	  
	case 2 : {Methode.Sejour(); 
//	System.out.println("Voulez vous afficher les données d'un autre patient?[O|N]!");
//	String choice1 = scanner.next();
//	
//	while("O".equals (choice1)) {
//		Methode.Sejour(); 
//		}
//		if ("N".equals(choice1)) {int s = getChoixUtilisateur(); Choix();}
//	
//	if (!"N".equals(choice1) && !"O".equals(choice1) ) {System.out.println("Saisie incorrecte!");
//	int s = getChoixUtilisateur(); Choix();}  
	break;
	}
	
	case 3 : {Methode.NbActe(); 
	
//	System.out.println("Voulez vous afficher les données d'un autre patient?[O|N]!");
//	
//	String choice2 = scanner.next();
//	
//	while("O".equals (choice2)) {
//		Methode.NbActe(); 
//		}
//		if ("N".equals(choice2)) {int s = getChoixUtilisateur(); Choix();}
//	
//	if (!"N".equals(choice2) && !"O".equals(choice2) ) {System.out.println("Saisie incorrecte!");
//	int s = getChoixUtilisateur(); Choix();}
//	
	break;
	}
	
		
	case 4 : {Methode.TrouverDiagnostic();
	
//	System.out.println("Voulez vous afficher les données d'un autre patient?[O|N]!");
//	String Choice3 = scanner.next();
//	
//	while("O".equals (Choice3)) {
//		Methode.TrouverDiagnostic(); 
//		}
//		if ("N".equals(Choice3)) {int s = getChoixUtilisateur(); Choix();}
//	
//	if (!"N".equals(Choice3) && !"O".equals(Choice3) ) {System.out.println("Saisie incorrecte!");
//	int s = getChoixUtilisateur(); Choix();} 
	break;
	}
	
	
	case 5 :System.out.println("Au revoir, A bientôt!"); System.exit(0);break;
	
	default: System.out.println("Votre choix est invalide!");
	}
	}
}

public static void main(String[] args) {

	Choix();
	
}

}
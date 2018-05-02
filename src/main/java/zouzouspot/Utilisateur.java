package zouzouspot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utilisateur extends Personne implements Relation{
	
	SimpleDateFormat date = new SimpleDateFormat("DD-mm-YYYY");
	Scanner sc = new Scanner (System.in);
	
	private String pseudo;
	
	public void seConnecter() {
		
		System.out.println("Bienvenue!!!  Vous êtes connecté!!");
		
	}
	public void seDeconnecter() {
		
		System.out.println("Merci à bientot sur ZouzouSpot!!!");
		
	}
	
	public void ajouterPersonne() {
		// TODO Auto-generated method stub
		
		System.out.println("Ajouter un ami.");
		String nom = sc.nextLine();
		String prenom = sc.nextLine();
		String pseudo = sc.nextLine();
		Date date = Date.parse();  //utiliser parse pour transformer la variable date et la lire via le scanner
		Date dateNaissance = sc.nextLine();
		
		
	}

}

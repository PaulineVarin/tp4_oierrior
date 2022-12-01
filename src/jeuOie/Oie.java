package jeuOie;

import cases.Case;
import utils.Journal;

public class Oie {
	private String couleur ; 
	private Plateau plateau ; 
	private Case casePlateau ; 
	private Journal journal ; 
	private De de; 
	
	
	public Oie(String s, Plateau plateau, De de) {
		this.couleur = s ; 
		this.plateau = plateau ; 
		this.de = de ; 
		this.journal = new Journal() ; 
	}
	
	public Plateau getPlateau() {
		return this.plateau ; 
	}
	
	public String getCouleur() {
		return this.couleur ; 
	}
	
	public boolean action() {
		this.casePlateau = this.casePlateau.depart(this) ; 
		return true ; 
	}
	
	public int lancerDe() {
		return this.de.lancer() ;  
	}
	
	public void ajouterMessage(String message) {
		this.journal.ajouterMessage(message);
		
	}
	

}

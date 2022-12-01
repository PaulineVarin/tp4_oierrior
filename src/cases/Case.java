package cases;

import jeuOie.Oie;

public class Case {
	private int numCase; 
	
	
	public Case (int numCase) {
		this.numCase = numCase ; 
	}
	
	public String getNom() {
		return "numero "+this.numCase ; 
	}
	
	public int getNum() {
		return this.numCase ; 
	}
	
	public Case depart(Oie oie) {
		//vérifier que la case possède une action spéciale et l'appliquer si besoin 
		//Passer à la case suivante
		int lancerDe = oie.lancerDe() ; 
		int numCase = this.getNum() ; 
		Case c = suivante(oie,(lancerDe+numCase)-1) ; 
		return arrivee(oie) ; 
	}
	
	protected Case suivante(Oie oie, int numCaseDestination) {
		Case c = oie.getPlateau().donnerCase(numCaseDestination) ; 
		return arrivee(oie); 
		
	}
	
	protected Case arrivee(Oie oie) {
		//Indique les actions à  effectuer lorsqu'on tombe sur la case d'arivé et on renvoie la case
		oie.ajouterMessage("L'oie "+oie.getCouleur()+ "arrive sur la case "+this.getNum());
		return this ; 
		
		
	}
	

}

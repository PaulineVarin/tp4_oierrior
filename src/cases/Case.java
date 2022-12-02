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
		oie.ajouterMessage("L'oie "+oie.getCouleur()+ " est sur la case "+this.getNum());
		
		int lancerDe = oie.lancerDe() ; 
		int numCase = this.getNum() ; 
		oie.ajouterMessage("Le dé donne " +lancerDe);
		
		Case c = suivante(oie,(lancerDe+numCase)) ; 
		return c ; 
	}
	
	protected Case suivante(Oie oie, int numCaseDestination) {
		oie.ajouterMessage(("L'oie "+oie.getCouleur()+ " doit se déplacer sur la case "+numCaseDestination));
		Case c = oie.getPlateau().donnerCase(numCaseDestination); 
		Case resArrive = c.arrivee(oie) ; 
		return resArrive ; 
		
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage("L'oie "+oie.getCouleur()+ " arrive sur la case "+this.getNum());
		//Indique les actions à  effectuer lorsqu'on tombe sur la case d'arivé et on renvoie la case
		return this ; 
		//test token
		
		
	}
	

}

package main;
import jeuOie.JeuOie;

public class mainJeu {

	public static void main(String[] args) {
		JeuOie jeuOie = new JeuOie(3);
		jeuOie.ajouterOie("verte");
		jeuOie.ajouterOie("jaune");
		jeuOie.ajouterOie("bleu");
		jeuOie.jouer();
	}

}

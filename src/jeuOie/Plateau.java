package jeuOie;

import java.util.ArrayList;

import cases.Case;

public class Plateau {
	
	private final static  int NB_CASES = 63 ; 
	private ArrayList<Case> cases = new ArrayList<>() ; 
	
	public Plateau () {
		for (int i=1 ; i<NB_CASES;i++) {
			Case c = new Case(i) ; 
			cases.add(c) ; 
		}
		
	}
	
	public Case donnerCase(int numCase) {
		return this.cases.get(numCase-1) ; 
	}
	

}

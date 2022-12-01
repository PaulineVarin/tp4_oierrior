package jeuOie;

import java.util.Random;

public class De {
	
	private Random rand = new Random()  ; 
	
	public int lancer() {
		return rand.nextInt(1, 7); 
	}

}

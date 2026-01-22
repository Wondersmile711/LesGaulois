package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU… UN GAUGAU…");
		
		for (int i = 0; i < 2; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		asterix.frapper(minus);
		
		Druide panoramix = new Druide("Panoramix");
		panoramix.fabriquerPotion(3);
		panoramix.parler("J'ai concocté " + panoramix.getQuantitePotion() + " doses de potion magique. Elle a une force de " + panoramix.getForcePotion() + " .");
		
	}
}

package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import personnages.Druide;
import personnages.Equipement;
import personnages.GRADE;

public class TestGaulois {
	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);

		Soldat minus = new Soldat("Minus", 6, GRADE.SOLDAT);

		minus.equiperEquipement(Equipement.BOUCLIER);
		minus.equiperEquipement(Equipement.CASQUE);
		minus.equiperEquipement(Equipement.PLASTRON);

		Druide panoramix = new Druide("Panoramix");
		panoramix.fabriquerPotion(3);
		panoramix.boosterGaulois(asterix);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(assurancetourix);
		panoramix.boosterGaulois(abraracourcix);
		panoramix.boosterGaulois(agecanonix);
		asterix.parler("Bonjour à tous");

		minus.parler("UN GAU… UN GAUGAU…");

		for (int i = 0; i < 2 && !asterix.estATerre() && !minus.estATerre(); i++) {
			asterix.frapper(minus);
			if (!minus.estATerre()) {
				minus.frapper(asterix);
			}
		}

	}
}

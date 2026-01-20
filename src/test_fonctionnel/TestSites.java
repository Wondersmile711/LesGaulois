package test_fonctionnel;

import personnages.GRADE;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {

	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Village village = new Village(vercingetorix);

		Soldat minus = new Soldat("Minus", 2, GRADE.CENTURION);
		Camp camp = new Camp(minus);

		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain");

		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);

		Soldat brutus = new Soldat("Brutus", 5, GRADE.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, GRADE.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, GRADE.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, GRADE.OPTIO);

		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);

		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);

		village.afficherVillage();
		camp.afficherCamp();

		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		village.changerChef(abraracourcix);

		Soldat briseradius = new Soldat("Briseradius", 4, GRADE.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, GRADE.CENTURION);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);

	}

}

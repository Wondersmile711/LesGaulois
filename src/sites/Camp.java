package sites;

import personnages.GRADE;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3];
	int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
		} else {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet ! ");
		}
	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats : ");
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println("- " + soldats[i].getNom());
		}
	}

	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade() == GRADE.CENTURION) {
			commandant = soldat;
			commandant.parler("Moi " + soldat.getNom() + " je prends la direction du camp romain.");
		} else {
			soldat.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}
}

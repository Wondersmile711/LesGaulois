package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[4];
	int nbGaulois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois villageois) {
		if (nbGaulois < gaulois.length) {
			gaulois[nbGaulois] = villageois;
			nbGaulois++;
			chef.parler("Bienvenue " + villageois.getNom() + " ! ");
		} else {
			chef.parler("Désolé " + villageois.getNom() + " mon village est déjà bien rempli.");
		}
	}

	public void afficherVillage() {
		System.out.println("Le village de " + chef.getNom() + " est habité par : ");
		for (int i = 0; i < nbGaulois; i++) {
			System.out.println("- " + gaulois[i].getNom());
		}
	}

	public void changerChef(Gaulois villageois) {
		chef.parler("Je laisse mon bouclier au grand " + villageois.getNom());
		villageois.parler("Merci ! ");
		chef = villageois;
	}
}

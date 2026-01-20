package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(this.donnerAuteur() + nom + ": \"" + texte + "\".");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage adversaire) {
		String nomPersonnage = adversaire.getNom();
		System.out.println(this.donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur()
				+ nomPersonnage + ".");
		adversaire.recevoirCoup(force / 3);
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe");
		}
	}
}

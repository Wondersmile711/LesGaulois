package personnages;

public abstract class Personnage {
	protected String nom;
	protected int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le " + this.donnerAuteur() + nom + ": \"" + texte + "\".");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage adversaire) {
		String nomPersonnage = adversaire.getNom();
		System.out.println("Le " + this.donnerAuteur() + nom + " donne un grand coup de force " + force + " au "
				+ adversaire.donnerAuteur() + nomPersonnage + ".");
		adversaire.recevoirCoup(calculForceCoup());
	}

	protected int calculForceCoup() {
		return force;
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

	public boolean estATerre() {
		return force == 0;
	}
}

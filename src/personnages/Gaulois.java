package personnages;

public class Gaulois extends Personnage {
	private boolean potionBue = false;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String donnerAuteur() {
		return "Le gaulois ";
	}
	
	public void boirePotion(int forcePotion) {
		force = force * forcePotion;	
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		String nomPersonnage = adversaire.getNom();
		System.out.println(this.donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur()
				+ nomPersonnage + ".");
		adversaire.recevoirCoup(force / 3);
		if (potionBue && force > 1) {
			force --;
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
}

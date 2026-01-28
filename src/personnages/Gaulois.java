package personnages;

public class Gaulois extends Personnage {
	private double effetPotion = 1;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String donnerAuteur() {
		return "gaulois ";
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	@Override
	protected int calculForceCoup() {
		int forceCoup = (int) (force * effetPotion);
		effetPotion -= 0.5;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		return forceCoup;

	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
}

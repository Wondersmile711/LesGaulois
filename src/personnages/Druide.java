package personnages;

public class Druide extends Gaulois{
	private Chaudron chaudron;
	
	public Druide(String nom) {
		super(nom,0);
	}
	
	public void fabriquerPotion(int quantitePotion) {
		chaudron = new Chaudron(quantitePotion);
	}
	
	public int getQuantitePotion() {
		return chaudron.getQuantitePotion();
	}
	
	public int getForcePotion() {
		return chaudron.getForce();
	}
	
	
}

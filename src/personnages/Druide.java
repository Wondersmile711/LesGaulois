package personnages;

public class Druide extends Gaulois{
	private Chaudron chaudron;
	
	public Druide(String nom) {
		super(nom,0);
	}
	
	public void fabriquerPotion(int quantitePotion) {
		chaudron = new Chaudron(quantitePotion);
		parler("J'ai concocté " + chaudron.getQuantitePotion() + " doses de potion magique. Elle a une force de " + chaudron.getForce() + " .");
	}
		
	
	public void boosterGaulois(Gaulois gaulois) {
		if (chaudron.restePotion()) {
			if (gaulois.getNom() == "Obélix") {
				parler("Non, Obélix Non !... Et tu le sais très bien !");
			}
			else {
				chaudron.prendrePotion();
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
				gaulois.boirePotion(chaudron.getForce());
			}
		}
		else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}
	
}

package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Chaudron {
	private int quantitePotion;
	private Random random;
	private int force;

	public Chaudron(int quantitePotion) {
		this.quantitePotion = quantitePotion;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		force = random.nextInt(2, 7);
	}
	
	public boolean restePotion() {
		return quantitePotion != 0;
	}
	
	public int getForce() {
		return force;
	}
	
	public int getQuantitePotion() {
		return quantitePotion;
	}
	
	public void prendrePotion() {
		quantitePotion --;
	}
}

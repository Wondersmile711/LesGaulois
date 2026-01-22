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
	
	public int getQuantitePotion() {
		return quantitePotion;
	}
	
	public int getForce() {
		return force;
	}
}

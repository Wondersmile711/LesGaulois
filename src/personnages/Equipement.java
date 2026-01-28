package personnages;

public enum Equipement {
	CASQUE("casque", 2), PLASTRON("plastron", 3), BOUCLIER("bouclier", 3);

	private String chaine;
	private int forceEquipement;

	private Equipement(String chaine, int forceEquipement) {
		this.chaine = chaine;
		this.forceEquipement = forceEquipement;

	}

	@Override
	public String toString() {
		return chaine;
	}

	public int getForceEquipement() {
		return forceEquipement;
	}
}

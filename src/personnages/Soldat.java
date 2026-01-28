package personnages;

public class Soldat extends Romain {
	private GRADE grade;
	private Equipement[] equipements = new Equipement[3];
	private int nbEquipements = 0;

	public Soldat(String nom, int force, GRADE grade) {
		super(nom, force);
		this.grade = grade;
	}

	public GRADE getGrade() {
		return grade;
	}

	public boolean equiperEquipement(Equipement equipement) {
		boolean equipementTrouve = false;
		boolean equipementAjoute = false;
		for (int i = 0; i < nbEquipements; i++) {
			if (equipements[i] == equipement) {
				equipementTrouve = true;
			}
		}

		if (!equipementTrouve && nbEquipements < equipements.length) {
			equipements[nbEquipements] = equipement;
			equipementAjoute = true;
			nbEquipements++;
			System.out.println("Le " + grade + " " + nom + " s'équipe avec un " + equipement + ".");
		}
		return equipementAjoute;
	}

	@Override
	protected String donnerAuteur() {
		return grade + " ";
	}

	@Override
	public void recevoirCoup(int forceCoup) {
		int absorptionEquipement = 0;
		for (int i = 0; i < nbEquipements; i++) {
			absorptionEquipement += equipements[i].getForceEquipement();
			System.out.println(
					"Le " + equipements[i] + " " + "absorbe " + equipements[i].getForceEquipement() + " du coup");
		}
		forceCoup -= absorptionEquipement;
		if (forceCoup < 1) {
			forceCoup = 0;
		}
		super.recevoirCoup(forceCoup);
	}
}

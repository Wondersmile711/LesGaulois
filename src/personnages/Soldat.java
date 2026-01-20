package personnages;

public class Soldat extends Romain {
	private GRADE grade;

	public Soldat(String nom, int force, GRADE grade) {
		super(nom, force);
		this.grade = grade;
	}

	public GRADE getGrade() {
		return grade;
	}
}

package personnages;

public enum GRADE {
	SOLDAT("soldat"), TESSERARIUS("tesserarius"), OPTIO("optio"), CENTURION("centurion");

	private String chaine;

	private GRADE(String chaine) {
		this.chaine = chaine;
	}

	@Override
	public String toString() {
		return chaine;
	}
}

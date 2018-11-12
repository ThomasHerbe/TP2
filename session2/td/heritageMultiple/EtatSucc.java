package session2.td.heritageMultiple;


public abstract class EtatSucc implements NatInductif{

	private Nat predecesseur;

	public EtatSucc(Nat pred) {
		this.predecesseur = pred;
	}

	public int val() {
		return 1 + this.predecesseur().val();
	}

	public boolean estNul() {
		return false;
	}

	public Nat predecesseur() {
		return this.predecesseur;
	}

	public int chiffre(int i) {
		if(i < this.taille()){
			return Character.getNumericValue(Integer.toString(this.val()).charAt(this.taille() - 1 - i));
		}
		return 0;
	}

	public int taille() {
		return Integer.toString(this.val()).length();
	}
}

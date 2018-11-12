package session2.td.agregation;

import session2.td.heritageMultiple.Nat;

public class SuccInductif implements NaturelInductif{

	private EtatNaturelPur predecesseur;
	
	public SuccInductif(EtatNaturelPur naturelPur) {
		predecesseur = naturelPur;
	}
	

	public int val() {
		return 1 + this.predecesseur().val();
	}

	public boolean estNul() {
		return false;
	}

	public EtatNaturelPur predecesseur() {
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

	public String toString(){
		return Integer.toString(val());
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Nat))
			return false;
		Nat x = (Nat)obj;
		return this.val() == x.val();
	}
}

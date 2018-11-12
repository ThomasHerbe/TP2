package session2.td.agregation;

import session2.td.heritageMultiple.Nat;

public class ZeroInductif implements NaturelInductif{

	public ZeroInductif() {
		
	}
	
	@Override
	public boolean estNul() {
		return true;
	}

	@Override
	public EtatNaturelPur predecesseur() {
		return creerZero();
	}

	@Override
	public int chiffre(int i) {
		return 0;
	}

	@Override
	public int taille() {
		return 1;
	}

	@Override
	public int val() {
		return 0;
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

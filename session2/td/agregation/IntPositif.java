package session2.td.agregation;

import session2.td.heritageMultiple.Nat;

public class IntPositif implements EtatNaturelPur{

	private int val;

	public IntPositif(int val){
		if(val < 0)
			throw new IllegalArgumentException("Pas de Nat à patir d'un int négatif.");
		this.val = val;
	}

	@Override
	public int val() {
		return this.val;
	}

	@Override
	public boolean estNul() {
	return this.val() == 0;
	}

	@Override
	public EtatNaturelPur predecesseur() {
		if(this.estNul())
			throw new UnsupportedOperationException("Pas de prédécesseur.");
		return this.creerNatAvecValeur(this.val() - 1);
	}

	@Override
	public int chiffre(int i) {
		return (i == 0) ? this.val()%10 : (this.creerNatAvecValeur(this.val()/10)).chiffre(i-1);
	}

	@Override
	public int taille() {
		return (this.val() < 10) ? 1 : 1 + (this.creerNatAvecValeur(this.val()/10)).taille();
	}
	
	public EtatNaturelPur creerNatAvecValeur(int val) {
		return new IntPositif(val);
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

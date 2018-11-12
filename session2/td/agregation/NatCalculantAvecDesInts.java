package session2.td.agregation;


public class NatCalculantAvecDesInts extends NatDeleguantEtat{

	public NatCalculantAvecDesInts(EtatNaturelPur naturelPur) {
		super(naturelPur);
	}
	
	public Nat creerNatAvecEtat(EtatNaturelPur etatNaturelPur) {
		return new NatCalculantAvecDesInts(etatNaturelPur);
	}

	public Nat zero() {
		return this.creerNatAvecValeur(0);
	}

	public Nat somme(Nat x) {
		return this.creerNatAvecValeur(this.val() + x.val());
	}

	public Nat un() {
		return this.creerNatAvecValeur(1);
	}

	public Nat produit(Nat x) {
		return this.creerNatAvecValeur(this.val() * x.val());
	}


	public Nat modulo(Nat x) {
		return this.creerNatAvecValeur(this.val()%x.val());
	}

	public Nat div(Nat x) {
		return this.creerNatAvecValeur(this.val()/x.val());
	}
	
	public String toString() {
		return Integer.toString(this.val());
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Nat))
			return false;
		Nat x = (Nat)obj;
		return this.val() == x.val();
	}

}

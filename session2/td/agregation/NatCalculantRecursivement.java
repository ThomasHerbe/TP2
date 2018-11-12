package session2.td.agregation;

public class NatCalculantRecursivement extends NatDeleguantEtat{

	public NatCalculantRecursivement(EtatNaturelPur naturelPur) {
		super(naturelPur);
	}
	
	public Nat creerNatAvecEtat(EtatNaturelPur etatNaturelPur) {
		return new NatCalculantRecursivement(etatNaturelPur);
	}

	public Nat somme(Nat x) {
		if(this.estNul())
			return x;
		return this.creerSuccesseur(this.predecesseur().somme(x));
	}

	public Nat produit(Nat x) {
		if(this.estNul())
			return creerZero();
		return x.somme(this.predecesseur().produit(x));
	}
	
	public Nat modulo(Nat x) {
		if(this.estNul())
			return creerZero();
		Nat r = this.predecesseur().modulo(x);
		return this.creerSuccesseur(r).equals(x) ? this.creerZero() : this.creerSuccesseur(r);
	}

	public Nat div(Nat x) {
		if(this.estNul())
			return creerZero();
		Nat r = this.predecesseur().modulo(x);
		Nat q = this.predecesseur().div(x);
		return this.creerSuccesseur(r).equals(x) ? this.creerSuccesseur(q) : q;
	}

	@Override
	public Nat zero() {
		return creerNatAvecValeur(0);
	}

	@Override
	public Nat un() {
		return creerNatAvecValeur(1);
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

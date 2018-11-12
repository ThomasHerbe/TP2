package session2.td.heritageMultiple;

public interface AlgebreNatRecursifSuccesseur extends Nat{

	default public Nat zero() {
		return this.creerNatAvecValeur(0);
	}

	default public Nat un() {
		return this.creerNatAvecValeur(1);
	}


	default public Nat somme(Nat x) {
		return this.creerSuccesseur(this.predecesseur().somme(x));
	}


	default public Nat produit(Nat x) {
		return x.somme(this.predecesseur().produit(x));
	}

	default public Nat modulo(Nat x) {
		Nat r = this.predecesseur().modulo(x);
		return this.creerSuccesseur(r).equals(x) ? this.creerZero() : this.creerSuccesseur(r);
	}

	default public Nat div(Nat x) {
		Nat r = this.predecesseur().modulo(x);
		Nat q = this.predecesseur().div(x);
		return this.creerSuccesseur(r).equals(x) ? this.creerSuccesseur(q) : q;
	}
}

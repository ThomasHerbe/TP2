package session2.td.heritageMultiple;

public interface AlgebreNatRecursifZero extends Nat{

	default public Nat zero() {
		return creerZero();
	}

	default public Nat somme(Nat x) {
		return this.creerNatAvecValeur(x.val());
	}

	default public Nat un() {
		return this.creerSuccesseur(this.creerZero());
	}

	default public Nat produit(Nat x) {
		return this.creerNatAvecValeur(0);
	}

	default public Nat modulo(Nat x) {
		return this.creerNatAvecValeur(0);
	}


	default public Nat div(Nat x) {
		return this.creerNatAvecValeur(0);
	}

}

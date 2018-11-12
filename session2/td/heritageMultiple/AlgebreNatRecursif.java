package session2.td.heritageMultiple;

public interface AlgebreNatRecursif extends AlgebreNatRecursifZero, AlgebreNatRecursifSuccesseur{

	default public Nat zero() {
		return this.creerNatAvecValeur(0);
	}

	default public Nat un() {
		return this.creerNatAvecValeur(1);
	}

	default public Nat somme(Nat x) {
		if(this.estNul())
			return AlgebreNatRecursifZero.super.somme(x);
		return AlgebreNatRecursifSuccesseur.super.somme(x);
	}

	default public Nat produit(Nat x) {
		if(this.estNul())
			return AlgebreNatRecursifZero.super.produit(x);
		return AlgebreNatRecursifSuccesseur.super.produit(x);
	}

	default public Nat modulo(Nat x) {
		if(this.estNul())
			return AlgebreNatRecursifZero.super.modulo(x);
		return AlgebreNatRecursifSuccesseur.super.modulo(x);
	}

	default public Nat div(Nat x) {
		if(this.estNul())
			return AlgebreNatRecursifZero.super.div(x);
		return AlgebreNatRecursifSuccesseur.super.div(x);
	}
}

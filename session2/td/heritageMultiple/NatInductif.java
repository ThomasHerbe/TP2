package session2.td.heritageMultiple;

public interface NatInductif extends Nat{

	default public Nat creerNatAvecValeur(int i){
		if(i == 0)
			return this.creerZero();
		return this.creerSuccesseur(this.creerNatAvecValeur(i -1));
	}

	default public Nat creerNatAvecRepresentation(String repDecimale){
		return this.creerNatAvecValeur(Integer.parseInt(repDecimale));
	}
}

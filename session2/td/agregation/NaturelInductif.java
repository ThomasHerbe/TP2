package session2.td.agregation;

public interface NaturelInductif extends EtatNaturelPur{
	
	default public EtatNaturelPur creerNatAvecValeur(int val) {
		if(val == 0)
			return creerZero();
		return creerSuccesseur(creerNatAvecValeur(--val));
		
	}
	default public EtatNaturelPur creerZero() {
		return new ZeroInductif();
	}
	
	default public EtatNaturelPur creerSuccesseur(EtatNaturelPur predecesseur) {
		return new SuccInductif(predecesseur);
		
	}
}

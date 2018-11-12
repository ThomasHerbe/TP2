package session2.td.agregation;

import session1.td.FabriqueNaturels;

public interface EtatNaturelPur extends FabriqueNaturels<EtatNaturelPur>, EtatNaturel<EtatNaturelPur>{

	/*
	 * Pas sur (non-Javadoc)
	 * @see session1.td.FabriqueNaturels#creerNatAvecValeur(int)
	 */
	default public EtatNaturelPur creerNatAvecValeur(int val) {
		return new IntPositif(val);
		
	}
	default public EtatNaturelPur creerZero() {
		return creerNatAvecValeur(0);
	}
	default public EtatNaturelPur creerSuccesseur(EtatNaturelPur predecesseur) {
		return creerNatAvecValeur(predecesseur.val()+1);
		
	}
	default public EtatNaturelPur creerNatAvecRepresentation(String repDecimale) {
		return creerNatAvecValeur(Integer.parseInt(repDecimale));
	}
}

package session2.td.agregation;

import hierarchie.SemiAnneauUnitaireEuclidien;
import session2.td.heritageMultiple.FabriqueNaturels;

public interface Nat extends FabriqueNaturels<Nat>, SemiAnneauUnitaireEuclidien<Nat>, EtatNaturel<Nat>{
	
	public Nat creerNatAvecEtat(EtatNaturelPur naturelPur);
	public EtatNaturelPur etat();
}

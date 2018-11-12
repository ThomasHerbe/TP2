package session2.td.agregation;

public abstract class NatDeleguantEtat implements Nat{
	
	private EtatNaturelPur etatNaturelPur;
	
	public NatDeleguantEtat(EtatNaturelPur naturelPur) {
		etatNaturelPur = naturelPur;
	}
	
	public EtatNaturelPur etat() {
		return etatNaturelPur.creerNatAvecValeur(this.val());
	}
	
	public Nat creerNatAvecEtat(EtatNaturelPur etatNaturelPur) {
		return creerNatAvecValeur(etatNaturelPur.val());
	}
	
	@Override
	public int val() {
		return etatNaturelPur.val();
	}

	@Override
	public boolean estNul() {
		return this.val() == 0;
	}


	public Nat predecesseur() {
		return creerNatAvecEtat(etatNaturelPur.predecesseur());
	}

	public int chiffre(int i) {
		return (i == 0) ? this.val()%10 : (this.creerNatAvecValeur(this.val()/10)).chiffre(i-1);
	}

	public int taille() {
		return (this.val() < 10) ? 1 : 1 + (this.creerNatAvecValeur(this.val()/10)).taille();
	}
	
	public Nat creerNatAvecValeur(int val) {
		return creerNatAvecEtat(etatNaturelPur.creerNatAvecValeur(val));
	}
	
	public Nat creerZero() {
		return creerNatAvecEtat(etatNaturelPur.creerZero());
	}
	
	public Nat creerSuccesseur(Nat predecesseur) {
		return creerNatAvecEtat(etatNaturelPur.creerSuccesseur(predecesseur.etat()));
	}
	
	public Nat creerNatAvecRepresentation(String repDecimale) {
		return creerNatAvecEtat(etatNaturelPur.creerNatAvecRepresentation(repDecimale));
	}
	
	
}

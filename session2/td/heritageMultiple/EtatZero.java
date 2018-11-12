package session2.td.heritageMultiple;

public abstract class EtatZero implements NatInductif{

	public EtatZero()
	{

	}

	public boolean estNul(){
		return true;
	}
	public Nat predecesseur(){
		return null;
	}

 	public int chiffre(int i){
 		return 0;
 	}

	public int taille(){
		return 1;
	}

	public int val(){
		return 0;
	}
}

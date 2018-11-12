package session2.td.heritageMultiple;

public class ZeroRecursif extends EtatZero implements AlgebreNatRecursif{

	public ZeroRecursif() {
		super();
	}

	@Override
	public Nat creerZero() {
		return new ZeroRecursif();
	}

	@Override
	public Nat creerSuccesseur(Nat predecesseur) {
		return new SuccRecursif(predecesseur);
	}
	
	public String toString(){
		return Integer.toString(super.val());
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Nat))
			return false;
		Nat x = (Nat)obj;
		return this.val() == x.val();
	}

}

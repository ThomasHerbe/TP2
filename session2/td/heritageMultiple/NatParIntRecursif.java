package session2.td.heritageMultiple;

public class NatParIntRecursif extends IntPositif implements AlgebreNatRecursif{

	public NatParIntRecursif(int val) {
		super(val);
	}

	@Override
	public Nat creerNatAvecValeur(int val) {
		return new NatParIntRecursif(val);
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

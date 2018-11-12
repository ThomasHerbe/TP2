package session2.td.heritageMultiple;

public class NatParInt extends IntPositif implements AlgebreNatParInt{

	public NatParInt(int i) {
		super(i);
	}

	public Nat creerNatAvecValeur(int val) {
		return new NatParInt(val);
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

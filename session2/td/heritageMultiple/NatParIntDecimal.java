package session2.td.heritageMultiple;

public class NatParIntDecimal extends IntPositif implements AlgebreNatDecimal{

	public NatParIntDecimal(int val) {
		super(val);
	}

	public Nat creerNatAvecValeur(int val) {
		return new NatParIntDecimal(val);
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

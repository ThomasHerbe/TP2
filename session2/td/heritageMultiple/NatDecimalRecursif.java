package session2.td.heritageMultiple;

public class NatDecimalRecursif extends NombreDecimal implements AlgebreNatRecursif{

	protected NatDecimalRecursif(String rep) {
		super(rep);
	}

	@Override
	public Nat creerNatAvecRepresentation(String repDecimale) {
		return new NatDecimalRecursif(repDecimale);
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

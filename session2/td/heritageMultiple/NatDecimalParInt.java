package session2.td.heritageMultiple;

public class NatDecimalParInt extends NombreDecimal implements AlgebreNatParInt{

	public NatDecimalParInt(String str) {
		super(str);
	}

	public Nat creerNatAvecRepresentation(String repDecimale) {
		return new NatDecimalParInt(repDecimale);
	}

	public boolean equals(Object x){
		if(!(x instanceof Nat)) return false;
		Nat n = (Nat)x;
		return this.toString().equals(n.toString());
	}

    @Override
    public String toString() {
    	return this.chiffres;
    }
}

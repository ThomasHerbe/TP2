package session2.td.heritageMultiple;

public interface AlgebreNatRecursif extends AlgebreNatRecursifZero, AlgebreNatRecursifSuccesseur{

	@Override
	default Nat un() {
		// TODO Auto-generated method stub
		return AlgebreNatRecursifSuccesseur.super.un();
	}

	@Override
	default Nat somme(Nat x) {
		// TODO Auto-generated method stub
		return AlgebreNatRecursifZero.super.somme(x);
	}

}

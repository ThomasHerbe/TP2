package session2.td.agregation;

public interface EtatNaturel<T> {

	public boolean estNul();

	public T predecesseur();

	public int chiffre(int i);

	public int taille();

	public int val();
}

package model;

public abstract class Reservation {

	private final int jour;
	private final int mois;
	
	//	
	
	protected Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	//
	
	public int jour() { return this.jour; }
	
	public int mois() { return this.mois; }
	
	//
	
	@Override
	public abstract String toString();
	
}

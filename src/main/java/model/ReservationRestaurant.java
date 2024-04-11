package model;

public class ReservationRestaurant extends Reservation {

	private final int service;
	private final int table;
	
	private final String toStringMessage;
	
	//
	
	protected ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour, mois);
		
		//
		
		this.service = service;
		this.table = table;
		
		//
		
		StringBuilder toStringMessageBuilder = new StringBuilder();
		
		String serviceNumStr;
		switch(service) {
			case 1: serviceNumStr = "premier"; break;
			case 2: serviceNumStr = "deuxième"; break;
			default: serviceNumStr = service + "è";
		}
		
		toStringMessageBuilder.append("Le " + this.jour() + "/" + this.mois() + "\n");
		toStringMessageBuilder.append("Table " + this.table() + " pour le " + serviceNumStr + " service.");
		
		this.toStringMessage = toStringMessageBuilder.toString();
	}
	
	//
	
	public int service() { return this.service; }
	
	public int table() { return this.table; }
	
	//
	
	@Override
	public String toString() { return this.toStringMessage; }
	
}

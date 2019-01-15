package cb_exercise;

public abstract class Passenger {
	
	private static final int pUpkeep=1;
	
	public Passenger() {}

	public int getUpkeep() {
		return pUpkeep;
	}
	
	
	public abstract double getPrice();


}

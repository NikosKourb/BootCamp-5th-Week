package cb_exercise;

public class Normal extends Passenger {

	public static final double price=5.0;
	
	public Normal() {}
	

	@Override
	public double getPrice() {
		return Normal.price;
		}
	
	}
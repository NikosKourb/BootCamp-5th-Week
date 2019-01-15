package passengers;

public class Handicapped extends Passenger{

	public static final double price=2.0;
	
	public Handicapped() {}
	

	@Override
	public double getPrice() {
		return Handicapped.price;
		}
	
	}

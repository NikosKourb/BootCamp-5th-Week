package vehicles;

public class Truck extends Vehicle{
	
	public static final double price=45.0;

	public Truck() {}
	
	public Truck(double vLength) {
		super(vLength);
	}

	@Override
	public double getPrice() {
		return Truck.price;
	}

}

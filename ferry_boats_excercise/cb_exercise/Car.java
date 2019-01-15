package cb_exercise;

public class Car extends Vehicle{
	
	public static final double price=15.0;

	public Car() {}
	
	public Car(double vLength) {
		super(vLength);
	}

	@Override
	public double getPrice() {
		return Car.price;
	}

}

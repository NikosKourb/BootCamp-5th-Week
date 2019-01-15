package passengers;

public class CollegeStudent extends Passenger{

	public static final double price=2.5;
	
	public CollegeStudent() {}
	

	@Override
	public double getPrice() {
		return CollegeStudent.price;
		}
	
	}
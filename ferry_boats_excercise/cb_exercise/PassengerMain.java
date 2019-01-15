package cb_exercise;

public class PassengerMain {

	public static void main(String[] args) {
		
		Passenger n1=new Normal();
		Passenger cs1=new CollegeStudent();
		Passenger h1=new Handicapped();
		Passenger e1=new Elder();
		Passenger b1=new Baby();
		
		System.out.println(n1.getPrice()+" "+n1.getUpkeep());
		System.out.println(cs1.getPrice()+" "+cs1.getUpkeep());
		System.out.println(h1.getPrice()+" "+h1.getUpkeep());
		System.out.println(e1.getPrice()+" "+e1.getUpkeep());
		System.out.println(b1.getPrice()+" "+b1.getUpkeep());

	}

}

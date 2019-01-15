package vehicles;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle c1=new Car(3.5);
		Vehicle t1=new Truck(14.9);
		Motor m1=new Motor();
		
		System.out.println(c1.getPrice()+" "+c1.getVlength()+" "+c1.getVwidth());
		System.out.println(t1.getPrice()+" "+t1.getVlength()+" "+c1.getVwidth());
		System.out.println(m1.getPrice()+" "+m1.getMUpkeep());
		

	}

}

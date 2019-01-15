package vehicles;

public abstract class Vehicle {
	
	private double vLength;
	private static final double vWidth=1;
	
	public Vehicle() {}

	public Vehicle(double vlength) {
		this.vLength=vlength;
	}
	
	
	
	public double getVlength() {
		return vLength;
	}

	public void setVlength(double vLength) {
		vLength = vLength;
	}


	public double getVwidth() {
		return vWidth;
	}


	public abstract double getPrice();

}

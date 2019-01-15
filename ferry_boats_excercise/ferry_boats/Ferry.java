package ferry_boats;

public class Ferry {
	
	private double fLength;
	private int fRows;
	private int mCapacity;
	private int pCapacity;

	public Ferry() {}
	
	public Ferry(double flength,int frows,int mcapacity,int pcapacity) {
		this.fLength=flength;
		this.fRows=frows;
		this.mCapacity=mcapacity;
		this.pCapacity=pcapacity;
	}

}

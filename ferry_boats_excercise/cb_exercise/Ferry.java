package cb_exercise;

public class Ferry {
	
	String FerryName;
	private double fLength;
	private int fRows;
	private int mCapacity;
	private int pCapacity;
	double fincome;
	int Normal;
	int CollegeStudent;
	int Handicapped;
	int Elder;
	int Baby;

	public int getNormal() {
		return Normal;
	}

	public void setNormal(int normal) {
		Normal = normal;
	}

	public int getCollegeStudent() {
		return CollegeStudent;
	}

	public void setCollegeStudent(int collegeStudent) {
		CollegeStudent = collegeStudent;
	}

	public int getHandicapped() {
		return Handicapped;
	}

	public void setHandicapped(int handicapped) {
		Handicapped = handicapped;
	}

	public int getElder() {
		return Elder;
	}

	public void setElder(int elder) {
		Elder = elder;
	}

	public int getBaby() {
		return Baby;
	}

	public void setBaby(int baby) {
		Baby = baby;
	}

	public Ferry() {}
	
	public Ferry(String FerryName,double flength,int frows,int mcapacity,int pcapacity,double fincome,int Normal,int CollegeStudent,int Handicapped,int Elder,int Baby) {
		this.FerryName=FerryName;
		this.fLength=flength;
		this.fRows=frows;
		this.mCapacity=mcapacity;
		this.pCapacity=pcapacity;
		this.fincome=fincome;
		this.Normal=Normal;
		this.CollegeStudent=CollegeStudent;
		this.Handicapped=Handicapped;
		this.Elder=Elder;
		this.Baby=Baby;
	}

	public String getFerryName() {
		return FerryName;
	}

	public double getFincome() {
		return fincome;
	}

	public void setFincome(double fincome) {
		this.fincome = fincome;
	}

	public void setFerryName(String ferryName) {
		FerryName = ferryName;
	}

	public double getfLength() {
		return fLength;
	}

	public void setfLength(double fLength) {
		this.fLength = fLength;
	}

	public int getfRows() {
		return fRows;
	}

	public void setfRows(int fRows) {
		this.fRows = fRows;
	}

	public int getmCapacity() {
		return mCapacity;
	}

	public void setmCapacity(int mCapacity) {
		this.mCapacity = mCapacity;
	}

	public int getpCapacity() {
		return pCapacity;
	}

	public void setpCapacity(int pCapacity) {
		this.pCapacity = pCapacity;
	}

	
	
}


public class TV {
	private String maker;
	private int year;
	private int inch;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	
	public TV(String maker, int year, int inch) {
		super();
		this.maker = maker;
		this.year = year;
		this.inch = inch;
	}

	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public void show() {
		System.out.println(maker + "에서 만든 " + year+ "년형 " + inch + " 인치 티비");
	}

}

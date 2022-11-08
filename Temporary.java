
public class Temporary extends Employee {

	private int workHours;
	private int feePerHours;
	
	public Temporary(String name, int age, String part, String adress) {
		super(name, age, part, adress);
		this.feePerHours = 10000;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
		super.setFee(this.workHours * this.feePerHours);
	}

	public void printInfo() {
		System.out.println("이름 :" + super.getName());
		System.out.println("나이 :" + super.getAge());
		System.out.println("주소 :" + super.getAdress());
		System.out.println("부서 :" + super.getPart());
		System.out.println("급여 :" + super.getFee());
	}

}

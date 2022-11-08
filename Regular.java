
public class Regular extends Employee {

	public Regular(String name, int age, String part, String adress) {
		super(name, age, part, adress);
		// TODO Auto-generated constructor stub
	}
	
	public void setSalary(int salary) {
		super.setFee(salary);
	}
	
	public void printInfo() {
		System.out.println("이름 :" + super.getName());
		System.out.println("나이 :" + super.getAge());
		System.out.println("주소 :" + super.getAdress());
		System.out.println("부서 :" + super.getPart());
		System.out.println("급여 :" + super.getFee());
	}

}

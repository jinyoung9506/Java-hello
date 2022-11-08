
public class Employee {
	private String name;
	private int age;
	private String part;
	private String adress;
	private int fee;

	protected Employee(String name, int age, String part, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.part = part;
		this.adress = adress;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getPart() {
		return part;
	}

	protected void setPart(String part) {
		this.part = part;
	}

	protected String getAdress() {
		return adress;
	}

	protected void setAdress(String adress) {
		this.adress = adress;
	}

	protected int getFee() {
		return fee;
	}

	protected void setFee(int fee) {
		this.fee = fee;
	}
	
	
}


public class Gugudan {
	int dan;
	
	public Gugudan() {
		// TODO Auto-generated constructor stub
	}

	public Gugudan(int dan) {
		super();
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void printGugu(int dan) {
		for (int i = 1; i <= dan; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + " ");
			}
			System.out.println();
		}
	}
}


public class NumSum {
	private int sum;
	
	public NumSum(int num) {
		// TODO Auto-generated constructor stub
		setSum(num);
	}

	public int getSum() {
		return sum;
	}

	public int setSum(int num) {
		for (int i = 1; i <= num; i++) {
			this.sum += i;
		}
		return this.sum;
	}
}

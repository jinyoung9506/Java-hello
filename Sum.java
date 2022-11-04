
public class Sum {
	int sum;
	
	public Sum(int num) {
		sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
}

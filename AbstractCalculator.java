public class AbstractCalculator extends ACalculator{

	public AbstractCalculator(int num1, int num2) {
		super(num1, num2);      
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
}
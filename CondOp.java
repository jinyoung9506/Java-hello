
public class CondOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 100;
		
		int big = 0;
		int diff = 0;
		
		big = (num1 > num2) ? num1 : num2 ;
		System.out.println("큰 수 " + big);
		
		diff = (num1 > num2) ? num1 - num2 : num2 - num1 ;
		System.out.println("차이 " + diff);
	}

}

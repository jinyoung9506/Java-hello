import java.util.Scanner;

public class forOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int result = 0;
		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("A와 B의 최소공배수 찾기");
		System.out.print("A : ");
		a = scan.nextInt();
		System.out.print("B : ");
		b = scan.nextInt();
		min = a < b ? a : b;
		for (int i = min; i <= (a * b); i++) {
			if (((i % a) == 0) && ((i % b) == 0)) {
				result = i;
				break;
			}
		}
		System.out.println("최소공배수 : " + result);
		scan.close();
	}
}

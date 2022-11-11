import java.util.Scanner;

public class function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int layer = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("별의 탑");
		System.out.print("몇 층? :");
		layer = scanner.nextInt();
		
		starPrint(layer);
		
		System.out.println("100, 95, 95의 평균 등급 : " + grade(average(100, 95, 95)));
		
		
		
		System.out.println(" 100 까지의 합 : " + intSum(100));
		scanner.close();
	}
	
	public static int intSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
			sum += i;
			if (i < number) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
		return sum;
	}

	public static char grade(double score) {
		if (score >= 90) {
			return '수';
		} else if (score >= 80) {
			return '우';
		} else if (score >= 70) {
			return '미';
		} else if (score >= 60) {
			return '양';
		} else {
			return '가';
		}
	}
	
	public static double average(double kor, double eng, double math) {
		return ((kor + eng + math) / 3);
	}
	
	public static void starPrint(int count) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= (count - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}

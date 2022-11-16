import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 0;
		int temp = 0;
		int count = 10;
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		String str = "";
		
		System.out.println("업다운 게임");
		
		while (cont == true) {
			if (cont) {
				System.out.println("1~100 사이의 정수를 10회 이내에 맞춰주세요");
				target = (int)((Math.random() * 1000) % 100);
				while (target != temp) {
					System.out.print("정수 입력 :");
					temp = sc.nextInt();
					if (temp > target) {
						count--;
						System.out.println("DOWN 남은 횟수 " + count);
					} else if (temp < target) {
						count--;
						System.out.println("UP 남은 횟수 " + count);
					} else {
						System.out.println("정답" + target);
					}
					if (count <= 0) {
						System.out.println("찬스 소진");
						break;
					}
				}
			}
			str = sc.nextLine();
			System.out.print("게임을 진행 하시겠습니까 ? (Y/N) :");
			if ((str.equals("y")) || (str.equals("Y"))) {
				cont = true;
				count = 10;
			} else {
				cont = false;
				System.out.println("게임 종료");
			}
		}
		sc.close();
	}
}

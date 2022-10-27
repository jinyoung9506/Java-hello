public class forOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 9; j++) {
			System.out.print("-------------");
		}
		System.out.println("-");
		for (int i = 1; i <= 9; i++) {
			System.out.print("| ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + " ");
				if ((i * j) < 10) {
					System.out.print(" ");
				}
				System.out.print("| ");
			}
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print("-------------");
			}
			System.out.println("-");
		}
	}
}

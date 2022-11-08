
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][8];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i * arr[i].length) + (j + 1);
			}
		}
		for (int[] ar : arr) {
			for (int ar2 : ar) {
				System.out.print(ar2 + " ");
				if (ar2 < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

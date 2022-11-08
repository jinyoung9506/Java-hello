import java.util.Scanner;

public class LottoSetter {

	public static void main(String[] args) {
		int temp = 0;
		boolean on = true;
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			on = true;
			temp = (int)((Math.random() * 1000) % 46);
			while (temp == 0) {
				temp = (int)((Math.random() * 1000) % 46);
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == temp) {
					on = false;
				}
			}
			if (on) {
				arr[i] = temp;
			} else {
				i--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

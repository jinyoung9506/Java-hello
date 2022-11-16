import java.util.*;

public class SetLottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lottoSet;
		boolean cont = true;
		Scanner scan = new Scanner(System.in);
		String temp = "";
		
		while (cont) {
			System.out.println("이번주 로또번호 선정");
			lottoSet = new HashSet<>();
			
			while(lottoSet.size() < 6) {
				lottoSet.add((int)((Math.random() * 100) % 47));
			}
				// for-each문을 이용한 전체 출력
			for(int s : lottoSet)
				System.out.print(s + "\t");
			System.out.println();
			
			System.out.print("다시? (Y/N) : ");
			temp = scan.nextLine();
			
			if (temp.equals("Y") || temp.equals("y")) {
				cont = true;
			} else {
				cont = false;
			}
		}
		System.out.println("종료");
		scan.close();
    }
}

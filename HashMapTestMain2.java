import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int temp = 0;
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("나라이름 인구>> ");
				map.put(sc.next(), sc.nextInt());
			}
		
			// Key만 담고 있는 컬렉션 인스턴스 생성
			Set<String> ks = map.keySet();
			
			// 전체 Key 출력 (for-each문 기반)
			for(String n : ks)
				System.out.println(n + "은 " + map.get(n).toString() + "명");
			System.out.println("있습니다.");

				// 전체 Value 출력 (for-each문 기반)
				for(String n : ks)
					if (map.get(n) > temp) {
						temp = map.get(n);
						str = n;
					}
				System.out.println("제일 인구가 많은 나라는 " + str + "(으)로 " + temp +"명 입니다.");
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		sc.close();
	}
}

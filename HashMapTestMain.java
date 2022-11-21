import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean cont = true;
		HashMap<Integer, String> map = new HashMap<>();
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		map.put(2000, "에스프레소");
		map.put(2500, "아메리카노");
		map.put(3000, "카푸치노");
		map.put(3500, "카페라떼");
		
		
		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		// 전체 Key 출력 (for-each문 기반)
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + " ");
		System.out.println("있습니다. (종료시 종료 입력)");
		
		while (cont) {
			System.out.print("주문>>>");
			str = sc.nextLine();

			// 전체 Value 출력 (for-each문 기반)
			for(Integer n : ks)
				if (map.get(n).toString().equals(str)) {
					System.out.println(str + "는 " + n + "원 입니다.");
				} else if (str.equals("종료")) {
					cont = false;
				}
		}
		sc.close();
	}

}

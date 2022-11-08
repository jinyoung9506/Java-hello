public class MainTest3 {
	public static void main(String[] args) {
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		// 배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
		for(Box e: ar) {
			if(e.getBoxNum() == 505)
				System.out.println(e);
		}
	}
}

class Box {
	private int num;
	private String conts;
	   
	Box(int num, String cont) { 
		this.num = num;
		this.conts = cont; 
	}
	public int getBoxNum() {
		return this.num;
	}
	
	public String toString() {
		return conts;
	}
}


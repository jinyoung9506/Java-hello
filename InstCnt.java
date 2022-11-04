
public class InstCnt {
	static int instNum = 0;
	
	public InstCnt() {
		// TODO Auto-generated constructor stub
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
	
}

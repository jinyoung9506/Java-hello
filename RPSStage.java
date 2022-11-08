public class RPSStage {
	private String player;
	private String CPU;
	
	public RPSStage(String player) {
		super();
		this.player = player;
		setCPURand();
	}
	
	public void setCPURand() {
		int rand = (int)((Math.random() * 10) % 3);
		switch (rand) {
		case 0:
			this.CPU = "가위";
			break;
		case 1:
			this.CPU = "바위";
			break;
		case 2:
			this.CPU = "보";
			break;
		default:
			System.out.println("랜덤 에러");
			break;
		}
	}

	public void result() {
		if (this.player.equals("가위")) {
			if (this.CPU.equals("가위")) {
				System.out.println("무승부");
			}else if (this.CPU.equals("바위")) {
				System.out.println("패배");
			} else if (this.CPU.equals("보")) {
				System.out.println("승리");
			} else {
				System.out.println("CPU 에러");
			}
		} else if (this.player.equals("바위")) {
			if (this.CPU.equals("가위")) {
				System.out.println("승리");
			}else if (this.CPU.equals("바위")) {
				System.out.println("무승부");
			} else if (this.CPU.equals("보")) {
				System.out.println("패배");
			} else {
				System.out.println("CPU 에러");
			}
		} else if (this.player.equals("보")) {
			if (this.CPU.equals("가위")) {
				System.out.println("패배");
			}else if (this.CPU.equals("바위")) {
				System.out.println("승리");
			} else if (this.CPU.equals("보")) {
				System.out.println("무승부");
			} else {
				System.out.println("CPU 에러");
			}
		} else {
			System.out.println("플레이어 에러");
		}
	}
}

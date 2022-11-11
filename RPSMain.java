import java.util.Scanner;

public class RPSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String RPS;
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위?바위?보 : ");
		RPS = scanner.nextLine();
		
		RPSStage stage = new RPSStage(RPS);
		stage.result();
		scanner.close();
	}

}

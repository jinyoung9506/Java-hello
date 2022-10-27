import java.util.Scanner;

public class flowControl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalScore = 0;
		double avgScore = 0;
		int koreanScore = 0;
		int englishScore = 0;
		int mathScore = 0;
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요 : ");
		koreanScore = scan.nextInt();
		System.out.println();
		
		System.out.print("영어 점수를 입력해 주세요 : ");
		englishScore = scan.nextInt();
		System.out.println();
		
		System.out.print("수학 점수를 입력해 주세요 : ");
		mathScore = scan.nextInt();
		System.out.println();
		
		totalScore = koreanScore + englishScore + mathScore;
		avgScore = totalScore / 3;
		
		System.out.println("국어 과목의 평가 : " + setGrade(koreanScore));
		System.out.println("영어 과목의 평가 : " + setGrade(englishScore));
		System.out.println("수학 과목의 평가 : " + setGrade(mathScore));
		System.out.println("평균 평가 : " + setGrade(avgScore));
		
	}
	
	public static char setGrade(double score) {
		char grade;
		
		if (score >= 90) {
			grade = '수';
		} else if (score >= 80) {
			grade = '우';
		} else if (score >= 70) {
			grade = '미';
		} else if (score >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		return grade;
	}

}

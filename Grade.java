
public class Grade {
	double math;
	double english;
	double science;
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.english = english;
		this.science = science;
	}

	public double average() {
		// TODO Auto-generated method stub
		return ((this.math + this.english + this.science)/3);
	}

	public String getGrade() {
		// TODO Auto-generated method stub
		if (this.average() >= 90) {
			return "수";
		}
		else if (this.average() >= 80) {
			return "우";
		}
		else if (this.average() >= 70) {
			return "미";
		}
		else if (this.average() >= 60) {
			return "양";
		}
		else {
			return "가";
		}
	}

}

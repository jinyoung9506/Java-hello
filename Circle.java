
public class Circle extends Shape implements IShape {

	private int radious;
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		radious = r;
	}
	
	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

	public double getArea() {
		return radious * radious * Math.PI;
	}
	
	@Override
	public String toString() {
		return "넓이는 " + getArea() + "입니다.";
	}
}

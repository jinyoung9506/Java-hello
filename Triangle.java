
public class Triangle extends Shape {
	private int width;
	private int heigth;
	
	public Triangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getArea() {
		return ((double)(width * heigth)) / 2;
		
	} 
	
}

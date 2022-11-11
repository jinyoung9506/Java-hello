
public class Rectangle extends Shape implements IShape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return (this.width * this.height);
	}
}

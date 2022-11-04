
public class StarPrint {
	private int layer;
	
	public StarPrint() {
		this.layer = 0;
	}
	
	public StarPrint(int layer) {
		this.layer = layer;
	}
	
	public void getPrint() {
		this.print(this.layer);
	}
	
	public void getPrint(int layer) {
		this.print(layer);
	}
	
	public void print(int count) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void setLayer(int layer) {
		this.layer = layer;
	}
	
	public int getLayer() {
		return layer;
	}
}

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataFilterInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (DataInputStream in = new DataInputStream(new FileInputStream("Data.dat"))) {
			int num = in.readInt();
			double p = in.readDouble();
			System.out.println(num);
			System.out.println(p);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

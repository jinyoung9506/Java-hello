import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataFilterOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("Data.dat"))) {
			out.writeInt(750);
			out.writeDouble(Math.PI);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

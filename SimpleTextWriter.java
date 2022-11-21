import java.io.FileWriter;
import java.io.Writer;

public class SimpleTextWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Writer out = new FileWriter("data.txt")) {
			out.write("스트링");
			out.write('A');
			out.write('한');
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FileReaWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일 :");
		String src = sc.nextLine();
		
		try (Reader in = new FileReader(src)) {
			int ch;
			
			while (true) {
				ch = in.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try (Writer out = new FileWriter(src)) {
			for (int ch = (int)'A'; ch < ((int)'z' + 1) ; ch++) {
				out.write(ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

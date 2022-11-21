import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "data.txt";
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
		String es = "Life is long if you know how to use it.";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(src))) {
			bw.write(ks, 0, ks.length());
			bw.newLine();
			bw.write(es, 0, es.length());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(src))) {
			String str;
			while (true) {
				str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

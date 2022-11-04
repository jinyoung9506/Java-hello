
public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA", 1978, "스웨덴");
		
		song.show();
		
		int a = 3;
		a = a + song.getYear();
		System.out.println(song.getCountry());
	}
}

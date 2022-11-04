public class Song {
	
	private String title;
	private String atrist;
	private int year;
	private String country;
	
	public Song() {}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.atrist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(this.year + "년 " + this.country + " 국적의 " + this.atrist +"가 부른 " + this.title);
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAtrist() {
		return this.atrist;
	}
	public void setAtrist(String atrist) {
		this.atrist = atrist;
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

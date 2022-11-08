class MobilePhone {
   protected String number;
   
   public MobilePhone(String num) {
      number = num; 
   }
   public void answer() {
      System.out.println("Hi~ from " + number);
   }
}

class SmartPhone extends MobilePhone {
   private String androidVer;
   
   public SmartPhone(String num, String ver) {
      super(num);
      androidVer = ver;
   }
   public void playApp() {
      System.out.println("App is running in " + androidVer);
   }
}

public class MainTest2 {

	public static void main(String[] args) {
		   // 문자열 "123"이 저장된 인스턴스의 생성
		SmartPhone ph1 = 
	            new SmartPhone("010-555-777", "Nougat");
	   MobilePhone ph2 = 
	            new SmartPhone("010-999-333", "Nougat");
	   ph1.answer();
	   ph1.playApp();
	   System.out.println();
	   
	   ph2.answer();
	   //ph2.playApp();

	}
}

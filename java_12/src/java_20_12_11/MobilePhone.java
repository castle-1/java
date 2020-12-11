package java_20_12_11;

public class MobilePhone {
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-5555-7777", "nougat");
		
		phone.answer();
		phone.playApp();
		
		SmartPhone ph1 = new SmartPhone("010-555-777", "nougat");
		
		MobilePhone ph2 = new SmartPhone("010-2222-6666", "nougat");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer(); // 부모가 먼저 메모리에 올라간후 자식이 올라가기 때문
		//ph2.playAPP();// 모바일 폰이 스마트폰을 참조하기때문에 메모리에 모바일폰이 올라가고 그다음 스마트폰이 올라간다.
		//하지만 모바일폰이 참조할 수 있는 범위는 모바일폰 까지 스마트폰이 시작하는 주소를 참조할 수 없다.
	}
	
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}

}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

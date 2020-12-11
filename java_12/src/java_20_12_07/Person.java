package java_20_12_07;

public class Person {
	private int regiNum;
	private int passNum;
	
	Person(int num, int pnum){
		regiNum = num;
		passNum = pnum;
	}
	
	Person(int num){//생성자
		//regiNum = num;
		//passNum = 0;
		
		this(num, 0); // 생성자 호출
	}
	void showPersonalInfo() {
		System.out.println(regiNum+" "+passNum);
		
	}
	
	public static void main(String[] args) {
		Person jung = new Person(335577,112233);
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}

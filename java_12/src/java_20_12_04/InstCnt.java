package java_20_12_04;

public class InstCnt {
	static int instNum = 0; //static가 붙어있으면 클래스변수 또는 공유변수 또는 static변수라고 한다.
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

class ClassVar{
	public static void main(String[] args) {
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
	
}

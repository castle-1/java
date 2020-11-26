package java_20_11_25;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println('A'); // 'A'도 리터럴 이 과정에서는 인코딩 디코딩이 일어난다.
		System.out.println('A' + 'A');//연산을 하려면 결국 CPU로 보내야한다.
		//따라서 A가 인코딩 되어 메모리에 올라감 여기서 char타입은 int형보다 작기때문에 int로 자동형변환이 된다.
		//그레서 문자a에서 숫자65인 정수로 변환되어 연산하게 된다.

	}

}

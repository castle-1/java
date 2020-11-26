package java_20_11_26;

public class Ex01 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		double result = (double) a / b; // 0.0 추력 -> a/b연산시 정수형으로 연산되기때문에 result에 0이 대입됨
		// 0.75를 출력하려면 캐스팅하거나 a,b를 double로 선언해야함

		System.out.println(result);

	}

}

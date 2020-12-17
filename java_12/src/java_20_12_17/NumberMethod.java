package java_20_12_17;

public class NumberMethod {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = new Double(3.14);
		System.out.println(num2.intValue()); //인트형이라 소수점 삭제
		System.out.println(num2.doubleValue());

	}

}

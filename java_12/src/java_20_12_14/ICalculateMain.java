package java_20_12_14;

public interface ICalculateMain {

	public static void main(String[] args) {

		ICalculate calculate = new Caculate();

		System.out.println(calculate.add(1, 2));
		System.out.println(calculate.div(4, 3));
		System.out.println(calculate.mu1(3, 5));
		System.out.println(calculate.sub(5, 1));

	}
}

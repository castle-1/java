package java_20_12_15;

public class Cheolsu implements Calc {

	private int a, b; // 피연산자
	private char op;
	private int temp;

	void setValue(int a, int b, char op) {
		this.a = a;
		this.b = b;
		this.op = op;

	}

	void calculate() {
		switch (op) {
		case '+': {
			temp = add(a, b);
			break;
		}
		case '-': {
			temp = sub(a, b);
			break;
		}
		case '*': {
			temp = mu1(a, b);
			break;
		}
		case '/': {
			temp = div(a, b);
			break;
		}
		}

		System.out.println(temp);

	}

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		return a - b;
	}

	@Override
	public int mu1(int a, int b) {

		return a * b;
	}

	@Override
	public int div(int a, int b) {

		return a / b;
	}

}

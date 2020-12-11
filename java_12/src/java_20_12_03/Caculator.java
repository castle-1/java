package java_20_12_03;

public class Caculator {
	private int num1, num2;
	private char operator;

	public void caculatorPrint() {
		int temp = 0;

		switch (operator) {
		case '+': {
			temp = (num1 + num2);
			System.out.println(num1 + " " + operator + " " + num2 + " = " + temp);

			break;
		}
		case '-': {
			temp = (num1 - num2);
			System.out.println(num1 + " " + operator + "" + num2 + " = " + temp);

			break;
		}
		case '*': {
			temp = (num1 * num2);
			System.out.println(num1 + " " + operator + " " + num2 + " = " + temp);

			break;
		}
		case '/': {
			double temp2 = 0;
			temp = (num1 / num2);
			temp2 = (num1 % num2);
			System.out.println(num1 + " " + operator + " " + num2 + " = " + temp + "..." + temp2);
			break;
		}

		}

	}

	public Caculator(int num1, char operator, int num2) {

		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

}

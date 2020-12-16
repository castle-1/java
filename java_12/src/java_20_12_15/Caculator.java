package java_20_12_15;

public interface Caculator { //인터페이스

	int add(int x, int y); // 더하기

	int sub(int x, int y); // 빼기

	int mu1(int x, int y); // 곱하기

	int div(int x, int y); // 나누기

}

class Calculator2 implements Caculator { //인터페이스 상속
	private int x, y;
	private char op;

	public Calculator2(int x, int y,char op) {
		this.x = x;
		this.y = y;
		this.op = op;
	}

	public Calculator2() {
	}
	
	public void show() {
		int temp=0;
		switch (op) {
		case '+': {
			temp = add(x, y);
			break;
		}
		case '-': {
			temp = sub(x, y);
			break;
		}
		case '*': {
			temp = mu1(x, y);
			break;
		}
		case '/': {
			try {
				temp = div(x, y);
				
			}catch (Exception e) {
				System.out.println("y가 0입니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
		}

		System.out.println(temp);
		
	}

	@Override
	public int add(int x, int y) {

		return x + y;
	}

	@Override
	public int sub(int x, int y) {

		return x - y;
	}

	@Override
	public int mu1(int x, int y) {

		return x * y;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y;
	}

}

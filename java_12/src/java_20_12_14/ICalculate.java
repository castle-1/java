package java_20_12_14;

public interface ICalculate {

	int add(int x, int y); // 더하기

	int sub(int x, int y); // 빼기

	int mu1(int x, int y); // 곱하기

	int div(int x, int y); // 나누기

}


class Caculate implements ICalculate{

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	public int mu1(int x, int y) {
		
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		
		return x/y;
	}
	
}
package java_20_12_15;

abstract class Calc {
	protected int a, b;

	abstract int Calculate();// 계산

	public Calc() {
		this.a = a;
		this.b = b;

	}

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}

class Add extends Calc {

	public Add() {
		super();
		

	}

	@Override
	int Calculate() {
		return getA() + getB();

	}

}

class Sub extends Calc {

	public Sub() {
		super();
		

	}

	@Override
	int Calculate() {
		return getA() - getB();

	}

}

class Mul extends Calc {

	public Mul() {
		super();
	

	}

	@Override
	int Calculate() {
		return getA() * getB();

	}

}

class Div extends Calc {

	public Div() {
		super();
		

	}

	@Override
	int Calculate() {
		return getA() / getB();

	}

}

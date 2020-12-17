package java_20_12_16;

abstract public class Fruit {
	
	abstract void print();
}


class Grape extends Fruit{

	@Override
	public void print() {
		
		System.out.println("나는 포도이다.");
	}
	
}

class Apple extends Fruit{

	@Override
	public void print() {
		
		System.out.println("나는 사과이다.");
	}
	
}

class Pear extends Fruit{

	@Override
	public void print() {
		
		System.out.println("나는 배이다.");
	}
	
}




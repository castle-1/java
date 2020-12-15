package java_20_12_15;

abstract class Car {
	
	public static void main(String[] args) {
		Car car = new gen();
		car.run();
	}
	
	public abstract void start();
	public abstract void stop();
	
	final public void run() {
		start();
		stop();
	}

}

class gen extends Car{

	@Override
	public void start() {
		System.out.println("시동걸기");
	}

	@Override
	public void stop() {
		System.out.println("제동걸기");
	}
	
}

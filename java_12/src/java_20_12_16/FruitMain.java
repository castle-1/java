package java_20_12_16;

public class FruitMain {

	public static void main(String[] args) {

		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };

		for (Fruit f : fAry) {
			f.print();
		}

	}

}

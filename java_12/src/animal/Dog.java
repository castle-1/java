package animal;

public class Dog {
	public void welcome(zoo.Cat c) {
		c.makeSound();

		c.makeHappy();// makeHappy 는 디폴트라 다른패키지에서는 호출이 불가능
	}

}

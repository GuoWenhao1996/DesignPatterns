package com.gwhcool.factoryMethod;

public class Main {
	public static void main(String[] args) {
		AnimalFactory factory = new TigerFactory();
		Animal animal = factory.createAnimal();
		animal.eat();
		((Tiger) animal).run();

		factory = new DelphinFactory();
		animal = factory.createAnimal();
		animal.eat();
		((Delphin) animal).swim();

		// Exception in thread "main" java.lang.ClassCastException:
		// com.gwhcool.factoryMethod.Delphin cannot be cast to
		// com.gwhcool.factoryMethod.Tiger
		// at com.gwhcool.factoryMethod.Main.main(Main.java:15)
		((Tiger) animal).run();
	}
}

package com.gwhcool.simpleFactory;

public class Main {
	public static void main(String[] args) {
		Animal animal = SimpleFactory.createAnimal("Tiger", "»¢xx");
		animal.eat();
		((Tiger) animal).run();
		animal = SimpleFactory.createAnimal("Delphin", "ëà");
		animal.eat();
		((Delphin) animal).swim();
		animal = SimpleFactory.createAnimal("Parrot", "ðÐ");
		animal.eat();
		((Parrot) animal).fly();

		// Exception in thread "main" java.lang.ClassCastException:
		// com.gwhcool.simpleFactory.Parrot cannot be cast to
		// com.gwhcool.simpleFactory.Delphin
		// at com.gwhcool.simpleFactory.Main.main(Main.java:15)
		((Delphin) animal).swim();

	}
}

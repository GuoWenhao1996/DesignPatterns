package com.gwhcool.simpleFactory;

public class Main {
	public static void main(String[] args) {
		Animal animal = SimpleFactory.createAnimal("Tiger", "虎xx");
		animal.eat();
		((Tiger) animal).run();
		animal = SimpleFactory.createAnimal("Delphin", "豚xx");
		animal.eat();
		((Delphin) animal).swim();
		animal = SimpleFactory.createAnimal("Parrot", "鹦xx");
		animal.eat();
		((Parrot) animal).fly();

		// Exception in thread "main" java.lang.ClassCastException:
		// com.gwhcool.simpleFactory.Parrot cannot be cast to
		// com.gwhcool.simpleFactory.Delphin
		// at com.gwhcool.simpleFactory.Main.main(Main.java:15)
		((Delphin) animal).swim();

	}
}

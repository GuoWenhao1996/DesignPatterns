package com.gwhcool.simpleFactory;

public class SimpleFactory {
	public static Animal createAnimal(String objname, String name) {
		switch (objname) {
		case "Tiger":
			return new Tiger(name);
		case "Delphin":
			return new Delphin(name);
		case "Parrot":
			return new Parrot(name);
		default:
			return null;
		}
	}
}

package com.gwhcool.factoryMethod;

public class ParrotFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Parrot();
	}

}

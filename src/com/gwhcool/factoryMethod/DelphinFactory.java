package com.gwhcool.factoryMethod;

public class DelphinFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Delphin();
	}

}

package com.gwhcool.factoryMethod;

public class TigerFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Tiger();
	}

}

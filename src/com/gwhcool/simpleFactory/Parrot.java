package com.gwhcool.simpleFactory;

public class Parrot implements Animal {
	private String name;

	public Parrot(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("鹦鹉-" + name + "-在吃东西");
	}

	public void fly() {
		System.out.println("鹦鹉-" + name + "-在飞");
	}

}

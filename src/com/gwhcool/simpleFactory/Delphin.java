package com.gwhcool.simpleFactory;

public class Delphin implements Animal {
	private String name;

	public Delphin(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("海豚-" + name + "-在吃东西！");
	}

	public void swim() {
		System.out.println("海豚-" + name + "-在游泳！");
	}

}

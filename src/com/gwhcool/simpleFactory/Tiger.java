package com.gwhcool.simpleFactory;

public class Tiger implements Animal {
	private String name;

	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("老虎-" + name + "-在吃东西！");
	}

	public void run() {
		System.out.println("老虎-" + name + "-在跑！");
	}

}

package com.gwhcool.simpleFactory;

public class Parrot implements Animal {
	private String name;

	public Parrot(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("����-" + name + "-�ڳԶ�����");
	}

	public void fly() {
		System.out.println("����-" + name + "-�ڷɣ�");
	}

}

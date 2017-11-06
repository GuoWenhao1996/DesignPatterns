package com.gwhcool.simpleFactory;

public class Delphin implements Animal {
	private String name;

	public Delphin(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("����-" + name + "-�ڳԶ�����");
	}

	public void swim() {
		System.out.println("����-" + name + "-����Ӿ��");
	}

}

package com.gwhcool.simpleFactory;

public class Tiger implements Animal {
	private String name;

	public Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("�ϻ�-" + name + "-�ڳԶ�����");
	}

	public void run() {
		System.out.println("�ϻ�-" + name + "-���ܣ�");
	}

}

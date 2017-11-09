package com.gwhcool.strategy;

public class TempleteContext {
	private Salary salary;
	private Insurance insurance;
	private Tax tax;

	public TempleteContext(Salary salary, Insurance insurance, Tax tax) {
		super();
		this.salary = salary;
		this.insurance = insurance;
		this.tax = tax;
	}

	public void computer() {
		salary.computerSalary();
		insurance.computerInsurance();
		tax.computerTax();
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}

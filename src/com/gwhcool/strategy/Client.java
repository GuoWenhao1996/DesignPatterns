package com.gwhcool.strategy;

public class Client {
	public static void main(String[] args) {
		
		Salary heBeiSalary=new HeBeiSalary();
		Salary jiLinSalary=new JiLinSalary();
		Insurance heBeiInsurance=new HeBeiInsurance(); 
		Insurance jiLinInsurance=new JiLinInsurance(); 
		Tax hebeiTax=new HebeiTax();
		Tax jiLinTax=new JiLinTax();
		
		TempleteContext context=new TempleteContext(heBeiSalary,heBeiInsurance,hebeiTax);
		context.computer();
		
		context=new TempleteContext(jiLinSalary, jiLinInsurance, jiLinTax);
		context.computer();
		
	}
}

package com.xworkz.Inheritance;

public class Architect {

	
	String name;
	int age;
	double salary;

	Architect()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	

 	public Architect(String name,int age,double salary)
	{
		System.out.println("invoking with const String name,int age,double salary of architect");
		this.name=name;
		this.age=age;
		this.salary= salary;
		
	}
	void printInfo()
	{
		System.out.println("Architect name:"+name);
		System.out.println("Architect :"+age);
		System.out.println(" Architect:"+salary);
		
		
	}

}


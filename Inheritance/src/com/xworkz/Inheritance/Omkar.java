package com.xworkz.Inheritance;

public class Omkar  extends Architect {	
  Omkar()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	
	
    
   Omkar(String name,int age,double salary)
    {
  	  super(name,age,salary);
  	  System.out.println("invoking with const String name,int age,double salary of architect");
      this.name=name;
   	  this.age=age;
	  this.salary=salary;
	 
  	 
    }
}


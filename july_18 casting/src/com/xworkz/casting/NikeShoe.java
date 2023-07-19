package com.xworkz.casting;

public class NikeShoe  extends Shoe{

	  String ceo="John Donahoe" ;
	  String brandAmbassador="Michael Jordan";
	  
	  NikeShoe(String ceo,String brandAmbassador,int price,int size,String color)
	  {
		  super(price,size,color);
		  this.ceo=ceo;
		  this.brandAmbassador=brandAmbassador;
	  }
	  void print()
	  {
		  System.out.println("invoking the nike shoes");
		  System.out.println("Nike shoe price="+price);
	      System.out.println("Nike shoe size="+size);
	      System.out.println("Nike shoe color="+color);
		  System.out.println("Nike ceo="+ceo);
		  System.out.println("Nike brandAmbassador:"+brandAmbassador);
		  
	}

}

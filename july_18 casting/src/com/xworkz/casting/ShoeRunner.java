package com.xworkz.casting;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ShoeRunner  main method");
        Shoe Shoe1 =new  Shoe("casual wear","German",300,ShoeSize.FIVE,ShoeColor.WHITE);
        ShoeUtil.buy(shoe1);
       

        
        
        Shoe shoe2=new Shoe("John Donahoe","Michael Jordan",500,ShoeSize.TWO,ShoeColor.BLACK);
        ShoeUtil.buy(shoe2);
        
        
	}
}
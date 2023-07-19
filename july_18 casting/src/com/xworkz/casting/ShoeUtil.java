package com.xworkz.casting;

public class ShoeUtil {
	
	public static void buy(Shoe shoe)
	{
		if(shoe!=null)
		{
			System.out.printf("Shoe price="+shoe.price);
			System.out.printf("Shoe size="+shoe.size);
			System.out.printf("Shoe color="+shoe.color);
		    
			if(shoe instanceof PumaShoe)
			{
			PumaShoe puma=(PumaShoe)shoe;
			System.out.println("creating casting for pumashoe");
			}
			
			if(shoe instanceof NikeShoe)
			{
			NikeShoe nike=(NikeShoe)shoe;
			System.out.println("creating casting for nikeshoe");
			}
			
	}
	}
}

	
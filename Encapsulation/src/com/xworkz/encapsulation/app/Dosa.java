package com.xworkz.encapsulation.app;
// encapsulation means access and control data.It will hide the data variables 
//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.

//encapsulation menas acces the 

// getter means write and setter means read   
public class Dosa {
	//  private data members
	private String type;
	private int price;
	private int quantity;
	private int size;
	private int  noOfDosa;
	
	
	//getter method for type
	
  public  String getType() 
  {
	  return type;
	  
  }
// setter method for type
  public    void setType(String type) 
  {
	  this.type=type;
	  
  }
  
  public int getPrice() 
  {
	  return price;
	  
  }

  public void  setPrice(int price ) 
  {
	  this.price =price;
	  
  }
  
  
  public int getQunatity()
  {
	  return quantity;
	  
  }
   
  public void setQuantity(int quantity)
  {
	this.quantity = quantity;
}
  
  public int getSize()
  {
	return size;
}
    public void setSize(int size) 
    {
		this.size = size;
	}
    
    public int getNoOfDosa() {
		return noOfDosa;
	}
    
  public void setNoOfDosa(int noOfDosa)
  {
	this.noOfDosa = noOfDosa;
}
  
  @Override
	public String toString() {
		return type+""+ price +""+quantity +"" + size +"" +noOfDosa;
		
	}
	
  
}


  
 

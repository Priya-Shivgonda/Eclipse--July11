package com.xworkz.encapsulation.app;

public class Tap {

	
	//private data members
			private String type;
			private int price;
			private String brand;
			private int size;
			private int  noOfTap; 
			
			
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
		  
		  
		  public String getBrand()
		  {
			  return brand;
			  
		  }
		   
		  public void setBrand(String brand)
		  {
			this. brand =  brand;
		}
		  
		  public int getSize()
		  {
			return size;
		}
		    public void setSize(int size) 
		    {
				this.size = size;
			}
		    
		    public int getNoOfTap() {
				return noOfTap;
			}
		    
		  public void setNoOfTap(int noOfTap)
		  {
			this.noOfTap =noOfTap;
		}
		  
		  @Override
			public String toString() {
				return type+""+ price +""+brand +""+ size +"" +noOfTap ;

				
			}
			
		  
		}


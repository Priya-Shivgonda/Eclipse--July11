package com.xworkz.encapsulation.app;

public class Satelliete {
	//private data members
			private String type="Satellite navigation";
			private int price;
			//private String brand;
			private int size;
			private int  noOfSatelliete; 
			
			
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
		  
		  
		/*  public String getBrand()
		  {
			  return brand;
			  
		  }
		   
		  public void setBrand(String brand)
		  {
			this. brand =  brand;
		}
		*/
		  
		  public int getSize()
		  {
			return size;
		}
		    public void setSize(int size) 
		    {
				this.size = size;
			}
		    
		    public int getNoOfSatelliete() {
				return noOfSatelliete;
			}
		    
		  public void setNoOfSatellietet(int noOfSatelliete)
		  {
			this.noOfSatelliete =noOfSatelliete;
		}
		  
		  @Override
			public String toString() {
				return type+""+ price +""+ size +""+ noOfSatelliete;

				
			}
			
		  
		}


package com.xworkz.encapsulation.app;

public class NewsPaper {
	//private data members
			private String type;
			private int price;
			private String company;
			private int size;
			private int  noOfNewsPaper; 
			
			
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
		  
		  
		  public String getCompany()
		  {
			  return company;
			  
		  }
		   
		  public void setCompany(String company)
		  {
			this.company =company;
		}
		  
		  public int getSize()
		  {
			return size;
		}
		    public void setSize(int size) 
		    {
				this.size = size;
			}
		    
		    public int getNoOfNewsPaper() {
				return noOfNewsPaper;
			}
		    
		  public void setNoOfNewsPaper(int noOfNewsPaper)
		  {
			this.noOfNewsPaper =noOfNewsPaper;
		}
		  
		  @Override
			public String toString() {
				return type+""+ price +""+company +""+ size +"" +noOfNewsPaper;

				
			}
			
		  
		}



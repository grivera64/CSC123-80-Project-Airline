//package exam2;

/*
 * 
 * Name: FirstClassPassenger.java
 * Purpose: Represents a First Class Passenger on a flight
 * Author: grivera64
 * Date: 04/08/2021
 * 
*/

public class FirstClassPassenger extends Passenger
{
	
	//private field
	private String freqFlyer;
	
	//default constructor
	public FirstClassPassenger()
	{
		
		super("First");
		this.setFreqFlyer();
		
	}
	
	//sets the Frequency Flyer
	public void setFreqFlyer()
	{
		
		if (this.getTicketNumber() % 2 == 1)
		{
			
			this.freqFlyer = "YFF";
			
		}
		else
		{
			
			this.freqFlyer = "NFF";
			
		}
		
	}
	
	//returns the frequency of flyer
	public String getFreqFlyer()
	{
		
		return this.freqFlyer;
		
	}
	
	//returns the data of the First Class Passenger as a String
	public String toString()
	{
		
		return String.format("%s-%s", super.toString(), this.getFreqFlyer());
		
	}
	
}
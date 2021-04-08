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
	
	private String freqFlyer;
	
	public FirstClassPassenger()
	{
		
		super("First");
		this.setFreqFlyer();
		
	}
	
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
	
	public String getFreqFlyer()
	{
		
		return this.freqFlyer;
		
	}
	
	public String toString()
	{
		
		return String.format("%s-%s", super.toString(), this.getFreqFlyer());
		
	}
	
}
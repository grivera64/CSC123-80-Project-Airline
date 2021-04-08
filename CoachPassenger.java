//package exam2;

/*
 * 
 * Name: CoachPassenger.java
 * Purpose: Represents a Coach Passenger on a flight
 * Author: grivera64
 * Date: 04/08/2021
 * 
*/

public class CoachPassenger extends Passenger
{
	
	private String freqFlyer;
	
	public CoachPassenger()
	{
		
		super("Coach");
		this.setFreqFlyer();
		
	}
	
	public void setFreqFlyer()
	{
		
		if (this.getTicketNumber() % 2 == 1)
		{
			
			this.freqFlyer = "YFC";
			
		}
		else
		{
			
			this.freqFlyer = "NFC";
			
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
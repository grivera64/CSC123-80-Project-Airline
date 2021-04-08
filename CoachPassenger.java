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
	
	//private field
	private String freqFlyer;
	
	//default constructor
	public CoachPassenger()
	{
		
		super("Coach");
		this.setFreqFlyer();
		
	}
	
	//sets the frequency of flyer
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
	
	//returns the frequency of the flyer
	public String getFreqFlyer()
	{
		
		return this.freqFlyer;
		
	}
	
	//@Override
	//returns the data for the Coach
	public String toString()
	{
		
		return String.format("%s-%s", super.toString(), this.getFreqFlyer());
		
	}
	
}
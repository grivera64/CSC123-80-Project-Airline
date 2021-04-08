//package exam2;

/* 
 * 
 * Name: Passenger.java
 * Purpose: Represents the basic structure of a Passenger
 * 			on a flight
 * Author: grivera64
 * Date: 04/08/2021
 * 
 */

public abstract class Passenger implements Comparable<Passenger>
{
	
	private String passengerID;
	private String ticketClass;
	private int ticketNumber;
	
	public static int ticketCounter = 0;
	
	public Passenger(String ticketClass)
	{
		
		this.setTicketNumber();
		this.setTicketClass(ticketClass);
		this.setPassengerID();
		
	}
	
	public void setTicketNumber()
	{
		
		Passenger.ticketCounter++;
		
		this.ticketNumber = Passenger.ticketCounter;
		
	}
	
	public int getTicketNumber()
	{
		
		return this.ticketNumber;
		
	}
	
	public void setTicketClass(String tClass)
	{
		
		this.ticketClass = tClass;
		
	}
	
	public String getTicketClass()
	{
		
		return this.ticketClass;
		
	}
	
	public void setPassengerID()
	{
		
		this.passengerID = String.format("PID_%s %d", this.ticketClass, this.ticketNumber);
		
	}
	
	public String getPassengerID()
	{
		
		return this.passengerID;
		
	}
	
	public String toString()
	{
		
		return this.getPassengerID();
		
	}
	
	public int compareTo(Passenger o)
	{
		
		if (o.ticketClass.equalsIgnoreCase("First") 
				&& (this.ticketClass.equalsIgnoreCase("Coach")))
		{
			
			return 1;
			
		}
		else if (o.ticketClass.equalsIgnoreCase("Coach")
				&& this.ticketClass.equalsIgnoreCase("First"))
		{
			
			return -1;
			
		}
		else
		{
			
			return 0;
			
		}
		
	}
	
	public abstract void setFreqFlyer();
	public abstract String getFreqFlyer();
	
}
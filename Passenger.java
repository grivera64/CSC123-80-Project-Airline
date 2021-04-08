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
	
	//private fields
	private String passengerID;
	private String ticketClass;
	private int ticketNumber;
	
	//public global field
	public static int ticketCounter = 0;
	
	//constructor
	public Passenger(String ticketClass)
	{
		
		this.setTicketNumber();
		this.setTicketClass(ticketClass);
		this.setPassengerID();
		
	}
	
	//sets the ticket number for use in ID
	public void setTicketNumber()
	{
		
		Passenger.ticketCounter++;
		
		this.ticketNumber = Passenger.ticketCounter;
		
	}
	
	//returns the ticket number
	public int getTicketNumber()
	{
		
		return this.ticketNumber;
		
	}
	
	//sets the class of the ticket according to the passenger
	public void setTicketClass(String tClass)
	{
		
		this.ticketClass = tClass;
		
	}
	
	//gets the ticket class
	public String getTicketClass()
	{
		
		return this.ticketClass;
		
	}
	
	//creates the PassengerID accordingly
	//to the ticket number and class
	public void setPassengerID()
	{
		
		this.passengerID = String.format("PID_%s %d", this.ticketClass, this.ticketNumber);
		
	}
	
	//returns the ID
	public String getPassengerID()
	{
		
		return this.passengerID;
		
	}
	
	//@Override
	//returns the ID as a String
	public String toString()
	{
		
		return this.getPassengerID();
		
	}
	
	//@Override
	//Comparable allows for use in Collections.sort()
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
	
	//abstract methods
	public abstract void setFreqFlyer();
	public abstract String getFreqFlyer();
	
}
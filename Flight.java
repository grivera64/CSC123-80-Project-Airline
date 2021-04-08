//package exam2;

/*
 * 
 * Name: Flight.java
 * Purpose: Represents a flight queue
 * 			at an airline
 * Author: grivera64
 * Date: 04/08/2021
 * 
*/

/* Imports */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.IOException;
import java.io.PrintWriter;

public class Flight
{
	
	//private fields
	private String flightName;
	private int seats;
	private int seatsSold;
	private Random randy;
	private ArrayList<Passenger> passBooked = new ArrayList<Passenger>();
	private ArrayList<Passenger> boardingQueue = new ArrayList<Passenger>();
	
	//constructor
	public Flight(String flightName, int seed)
	{
		
		this.setFlightName(flightName);
		this.randy = new Random(seed);
		this.setSeats();
		
	}
	
	//set the name of the flight
	public void setFlightName(String flightName)
	{
		
		this.flightName = flightName;
		
	}
	
	//set the number of seats randomly
	public void setSeats()
	{
		
		this.seats = this.randy.nextInt(51) + 100;
		
	}
	
	//sell the seats to passengers
	public void sellSeats()
	{
		
		this.seatsSold = (this.seats / 2) + this.randy.nextInt(1 + (this.seats / 2));
		
		int selectedNum = 0;
		
		for (int seatSold = 1; seatSold <= seatsSold; seatSold++)
		{
			
			selectedNum = this.randy.nextInt(6);
			
			if (selectedNum == 3)
			{
				
				this.passBooked.add(new FirstClassPassenger());
				
			}
			else
			{
				
				this.passBooked.add(new CoachPassenger());
				
			}
			
		}
		
	}
	
	//fill and sort the boarding queue
	public void lineUpCall()
	{
		
		Iterator<Passenger> bookedPassengers = this.passBooked.iterator();
		
		while (bookedPassengers.hasNext())
		{
			this.boardingQueue.add(bookedPassengers.next());
		}
		
		Collections.sort(this.boardingQueue);
		
	}
	
	//print the details of the boarding queue
	public void boarding(PrintWriter outputWriter) throws IOException
	{
		
		//header
		outputWriter.printf("The boarding order for %s with %d seats and %d seats sold is:\n", 
				this.flightName, this.seats, this.seatsSold);
		
		//local variable
		int counter = 0;
		
		Iterator<Passenger> currPass = this.boardingQueue.iterator();
			
		/* Local Variables */
		Passenger currPassenger;
		FirstClassPassenger tempFirst;
		CoachPassenger tempCoach;
		
		//iterate through the boarding queue
		while (currPass.hasNext())	
		{
		
			currPassenger = currPass.next();
			
			//print the data of the passenger according to its type
			if (currPassenger instanceof FirstClassPassenger)
			{
				
				tempFirst = (FirstClassPassenger) currPassenger;
				
				outputWriter.printf("%-24s", tempFirst.toString());
				
			}
			else
			{
				
				tempCoach = (CoachPassenger) currPassenger;
				
				outputWriter.printf("%-24s", tempCoach.toString());
				
			}
			
			//every third passenger go to next row
			counter++;
			
			if (counter % 3 == 0)
			{
				
				outputWriter.printf("\n");
				
			}
		}
		
	}
	
}
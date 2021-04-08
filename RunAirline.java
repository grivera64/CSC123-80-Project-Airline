package exam2;

/*
 * 
 * Name: RunAirline.java
 * Purpose: 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class RunAirline
{
	
	public static void main(String[] args) throws IOException
	{
		
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		
		Scanner keyboard = new Scanner(System.in);
		
		String nameFlight;
		int seedFlight;
		
		for (int flightNums = 0; flightNums < 4; flightNums++)
		{
			
			System.out.printf("Please enter the Flight name:\n");
			nameFlight = keyboard.nextLine();
			
			do
			{
				System.out.printf("Please enter an integer seed from 1 to 50:\n");
				seedFlight = keyboard.nextInt();
				keyboard.nextLine();
			} while (!(seedFlight >= 1 && seedFlight <= 50));
				
			flightList.add(new Flight(nameFlight, seedFlight));
			
		}
		
		System.out.printf("Please enter the name of the output file: ");
		String fileName = keyboard.nextLine();
		
		PrintWriter outputWriter = new PrintWriter(new File(fileName));
		
		for (Flight flight : flightList)
		{
			
			flight.sellSeats();
			flight.lineUpCall();
			flight.boarding(outputWriter);
			outputWriter.printf("\n\n");
			
		}
		
		outputWriter.close();
		keyboard.close();
		
	}
	
}
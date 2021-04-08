//package exam2;

/*
 * 
 * Name: RunAirline.java
 * Purpose: Tests the other classes (Driver Class)
 * Author: grivera64
 * Date: 04/08/2021
 */

/* Imports */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class RunAirline
{
	
	//driver method of the program
	public static void main(String[] args) throws IOException
	{
		
		//create necessary items to create 4 flights
		ArrayList<Flight> flightList = new ArrayList<Flight>();
		
		Scanner keyboard = new Scanner(System.in);
		
		String nameFlight;
		int seedFlight;
		
		//request for data of 4 flights
		for (int flightNums = 0; flightNums < 4; flightNums++)
		{
			
			//ask for name
			System.out.printf("Please enter the Flight name:\n");
			nameFlight = keyboard.nextLine();
			
			//ask for a valid seed
			do
			{
				System.out.printf("Please enter an integer seed from 1 to 50:\n");
				seedFlight = keyboard.nextInt();
				keyboard.nextLine();
			} while (!(seedFlight >= 1 && seedFlight <= 50));
				
			//add flight to the list
			flightList.add(new Flight(nameFlight, seedFlight));
			
		}
		
		//request for output file name
		System.out.printf("Please enter the name of the output file: ");
		String fileName = keyboard.nextLine();
		
		//create output file if it doesn't exist
		PrintWriter outputWriter = new PrintWriter(new File(fileName));
		
		//set up each flight and print the data to the output file
		for (Flight flight : flightList)
		{
			
			flight.sellSeats();
			flight.lineUpCall();
			flight.boarding(outputWriter);
			outputWriter.printf("\n\n");
			
		}
		
		//close the PrintWriter and Scanner
		outputWriter.close();
		keyboard.close();
		
		//terminate program
		
	}
	
}
import java.util.Scanner;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to the Ticket vendor");
	
		Auditorium auditorium = new Auditorium(5,5);
		
		
		System.out.println("Would you like to: [Buy] Buy tickets [View] View the seating arrangement?");
		String input = reader.nextLine();
		while(input.equalsIgnoreCase("View")){
			System.out.println("O = open and R = Reserved");
			System.out.println(auditorium);
			System.out.println("Would you like to do anything else?");
			input = reader.nextLine();
		}
		int ticketChoice;
		String rowLetter;
		while(input.equalsIgnoreCase("Yes")){
		System.out.println("Ticket options:");
		System.out.println("\tWalkUp");
		System.out.println("\tAdvanced");
		System.out.println("\tStudent");
		System.out.println("\tStaff");
		System.out.println("Select a Number");
		ticketChoice = reader.nextInt();
		
		//System.out.println("\tSeat Number: ");
		switch(ticketChoice){
		case 1:
			System.out.println("Select a seat: \n\t Row Letter:");
			reader.nextLine();
		
		case 2:
			System.out.println("Select a seat: \n\t Row Letter:");
			reader.nextLine();
		
		
		case 3:
			System.out.println("Select a seat: \n\t Row Letter:");
			reader.nextLine();
		case 4:
			System.out.println("Select a seat: \n\t Row Letter:");
			reader.nextLine();
		}
		}
			//Ticket ticket1 = new WalkUp();
			//ticket1.setVenue("Fox");//is name the name of the theatre or of the ticketholder
			
			//System.out.println(ticket1);
			//System.out.println();
			/*Ticket ticket2 = new WalkUp();
			System.out.println(ticket2);*/	
			//Advanced ticket3 = new Advanced(32);
			//System.out.println(ticket3);
	}

}

package TrainReservationSystem;

import java.io.IOException;
import java.util.Scanner;

class Passenger {
	public boolean reserveSeats(int numSeats) {

		return false;

	}

}

class Trains {
	private int totalSeats;
	private int numSeatsToCheck;
	private int numSeatsToReserve;

//	public Trains(int totalSeats, int numSeatsToCheck) {
//		super();
//		this.totalSeats = totalSeats;
//		this.numSeatsToCheck = numSeatsToCheck;
//	}

	public boolean checkAvailability(int numSeats) {
		if (numSeatsToCheck < totalSeats) {
			return true;
		} else {
			return false;
		}

	}

	public boolean reserveSeats(int numSeats) {
		if (numSeatsToReserve < totalSeats) {
			return true;
		} else {
			return false;
		}

	}

}

class ReservationSystem {
	public boolean displayStatus() {
		return false;
	

	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Total No of seats in the train:");
		Scanner sc = new Scanner(System.in);
		int totalSeats = sc.nextInt();
		System.out.println(totalSeats);
		System.out.println("number of seats passsenger wants to check:");
		System.out.println("number of seats reserved:");

		
		int numSeatsToCheck = sc.nextInt();
		int numSeatsToReserve = sc.nextInt();
		// display output
		Passenger pass = new Passenger();
		Trains train = new Trains();
		ReservationSystem rs = new ReservationSystem();
		System.out.println(totalSeats);
		
	

	}

}

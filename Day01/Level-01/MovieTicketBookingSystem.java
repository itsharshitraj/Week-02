import java.util.*;

public class MovieTicketBookingSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter movie name :");
		String movieName = sc.nextLine();
		
		System.out.println("Enter seat number :");
		int seatNumber = sc.nextInt() ;
		
		System.out.println("Enter price :");
		double price = sc.nextDouble();
		
		MovieTicket movieTicket = new MovieTicket(movieName,seatNumber,price);
		movieTicket.displayTicketDetails();
		
	}}
	
	class MovieTicket{
		private  String movieName;
		private int seatNumber;
		private  double price;
		private boolean isBooked;
		
		// constructor
		
		MovieTicket(String movieName, int seatNumber,double price){
			this.movieName=movieName;
			this.seatNumber=seatNumber;
			this.price=price;
			this.isBooked=false;
			
		}
		// method to book ticket (assign seat and update price)
		public void bookTicket(){
			if(isBooked){
				System.out.println("Seat " + seatNumber + " for movie " + movieName + " is already booked ");
				}else{
				isBooked=true;
				System.out.println("Seat " + seatNumber + " for movie " + movieName + "is successfully booked");
			}
		}
		
		// method to display ticket details
		public void displayTicketDetails(){
			
			System.out.println("Movie Name: " + movieName);
			System.out.println("Seat Number: " + seatNumber);
			System.out.println("Price: $" + price);
			System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
		}
	}	
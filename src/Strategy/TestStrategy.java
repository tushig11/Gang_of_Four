package Strategy;

import java.util.Arrays;
import java.util.List;

public class TestStrategy {

	public static void main(String[] args) {
		List<Flight> myFlights = Arrays.asList(
				new Flight(200),
				new Flight(250),
				new Flight(170),
				new Flight(210),
				new Flight(130)
		);
		
		Model m1 = new SinglePrice();
		Model m2 = new TwoClass();
		Model m3 = new MultiClass();
		
		System.out.println("SinglePrice model profit: " + m1.getRevenue(myFlights) +"$");
		System.out.println("TwoClasses model profit: " + m2.getRevenue(myFlights) +"$");
		System.out.println("MultiClasses model profit: " + m3.getRevenue(myFlights) +"$");
	}

}

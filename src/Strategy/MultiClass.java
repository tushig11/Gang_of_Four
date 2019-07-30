package Strategy;

import java.util.List;

public class MultiClass implements Model{
	
	private long type1 = (long) (Model.ticketPrice * 4);
	private long type2 = (long) (Model.ticketPrice * 1.5);
	private long type3 = (long) (Model.ticketPrice * 0.75);
	
	@Override
	public long getRevenue(List<Flight> flights) {
		int total = 0;
		
		for(Flight f: flights) {
			long first = (long) (f.getPassengers()*0.1);
			long business = (long) (f.getPassengers()*0.2);
			long coach = (long) (f.getPassengers()*0.7);
			total += first * type1 + business * type2 + coach * type3  - Model.fixedCost*1.2;
		}
		return total;
	}

}

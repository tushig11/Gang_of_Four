package Strategy;

import java.util.List;

public class TwoClass implements Model{
	private long type1 = (long) (Model.ticketPrice * 1.5);
	private long type2 = (long) (Model.ticketPrice * 0.75);
	@Override
	public long getRevenue(List<Flight> flights) {
		int total = 0;
		
		for(Flight f: flights) {
			long business = f.getPassengers()*1/3;
			long coach = f.getPassengers()*2/3;
			total += business * type1 + coach * type2  - Model.fixedCost;
		}
		return total;
	}

}

package Strategy;

import java.util.List;

public class SinglePrice implements Model{
	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;
		for(Flight f: flights) {
			total += f.getPassengers() * Model.ticketPrice - Model.fixedCost;
		}
		return total;
	}
}

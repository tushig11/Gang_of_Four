package Strategy;

import java.util.List;

public interface Model {
	static final int ticketPrice = 300;
	static final int fixedCost = 50000;
	public long getRevenue(List<Flight> flights);
}

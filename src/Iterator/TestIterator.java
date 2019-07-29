package Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregate agg = new NameRepository();
		Iterator it = agg.getIterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
	}

}
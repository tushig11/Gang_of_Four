package Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col = new NameRepository();
		Iterator it = col.getIterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
	}

}
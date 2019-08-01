package Observer;

import java.util.ArrayList;
import java.util.List;

public class TestObserver {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("Ben");
				
		System.out.println("-- My Application --");
		NameData data = new NameData();
		new ConcreteObserver(data);
		
		data.setNameData(names);
		data.addName("Bryan");
		data.addName("Steve");
		data.removeName("Bryan");
		data.addName("Ken");
	}
}

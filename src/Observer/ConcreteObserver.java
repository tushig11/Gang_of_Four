package Observer;

import java.util.List;

public class ConcreteObserver implements Observer{

	private List<String> names;
	
	public ConcreteObserver(NameData data) {
		data.attach(this);
	}

	@Override
	public void update(List<String> name) {
		this.names = name;
		display();
	}

	public void display() {
		System.out.println("--> Data <--");
		names.stream().forEach(System.out::println);
	}
}

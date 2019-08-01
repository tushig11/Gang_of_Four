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
		System.out.print("--> Data: ");	
		for(String n: names) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}

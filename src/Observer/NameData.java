package Observer;

import java.util.ArrayList;
import java.util.List;

public class NameData implements Subject{
	
	private List<String> names = new ArrayList<String>();
	private List<Observer> observers = new ArrayList<>();
	private final Object LOCK = new Object();

	@Override
	public void attach(Observer observer) {	
		synchronized (LOCK) {
			if (!observers.contains(observer))
				observers.add(observer);
				
		}
	}

	@Override
	public void detach(Observer observer) {
		synchronized (LOCK) {
			int i = observers.indexOf(observer);
				if (i >= 0)
					observers.remove(i);
			}
	}

	@Override
	public void notifyObservers() {
		synchronized (LOCK){
			int n = observers.size();
			for (int i = 0; i < n; ++i) {
				Observer observer = (Observer) observers.get(i);
				observer.update(names);
			}
		}
	}
	
	public void addName(String name) {
		System.out.println("--> Action add: " + name + " <--");
		this.names.add(name);
		sendNameData();
	}
	
	public void removeName(String name) {
		System.out.println("--> Action remove: "+name+" <--");
		this.names.remove(name);
		sendNameData();
	}
	
	public void setNameData(List<String> name) {
			this.names = name;
			sendNameData();
	}
	
	public void sendNameData() {
		notifyObservers();
	}
}

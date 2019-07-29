package Adapter;

public class Adapter implements Stack, Queue{
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public void queue(String str) {
		adaptee.add(str);
	}
	
	@Override
	public String pop() {
		int end = adaptee.getEnd();
		if(end == -1) return null;
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public String dequeue() {
		int end = adaptee.getEnd();
		if(end == -1) return null;
		String str = adaptee.get(0);
		adaptee.remove(0);
		return str;
	}
	
	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}
	
}
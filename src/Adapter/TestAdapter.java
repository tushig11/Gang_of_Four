package Adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Adapter();
		System.out.println(myStack.isEmpty());
		myStack.push("1");
		myStack.push("2");
		System.out.println(myStack.pop());
		
		Queue myQueue = new Adapter();
		System.out.println(myQueue.isEmpty());
		myQueue.queue("1");
		myQueue.queue("2");
		System.out.println(myQueue.dequeue());
		
	}

}

package Singleton;

public class Singleton {
	private static Singleton uniqueInstance = null;
	private int data = 0;
	
	/**
	* Returns a reference to the single instance. Creates the instance if it
	* does not yet exist. (This is called lazy instantiation.)
	*/
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
			System.out.println("Singleton Instance Created");
		}else {
			System.out.println("Instance already instantiated");
		}
		return uniqueInstance;
	}
	
	/**
	* The Singleton Constructor. Note that it is private! No client can
	* instantiate a Singleton object directly!
	*/
	
	private Singleton() {
	}
	
	// Accessors and mutators here!
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
}
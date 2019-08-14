package Prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("A");
		Employee e2 = (Employee) e1.doClone();
		e1.setName("B");
		
		System.out.println("e1: " + e1.toString());
		System.out.println("e2: " + e2.toString());
		
	}

}

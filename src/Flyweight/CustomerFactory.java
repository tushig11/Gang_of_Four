package Flyweight;

import java.util.HashMap;

public class CustomerFactory {
	private static HashMap<Integer, Customer> hm = 
			new HashMap<Integer, Customer>();
	
	public static Customer getCustomer(int id,String firstName,String lastName,Address address, HealthProfile profile)
	{
		Customer c = null;
		
		if(hm.containsKey(id))
			c = hm.get(id);
		else
		{
			c = new Customer();
			c.createCustomer(id, firstName, lastName, address, profile);
			hm.put(id, c);
		
		}
		
		return c;
	}
	
	public static void display()
	{
		System.out.println("<<<<<<<<<<<Hashmap Datas>>>>>>>>>>>>>>");
		for(Customer c : hm.values())
		{
			System.out.println("Display: " + c.getId() + " " + c.getFirstname() + " " + c.getLastname());
		}
	}
}

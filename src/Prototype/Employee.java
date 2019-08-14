package Prototype;

import java.io.Serializable;

public class Employee implements Prototype, Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public Object doClone() {
		// TODO Auto-generated method stub
		return new Employee(name);
	}
	
	@Override
	public String toString()
	{
		return "Employee name is " + name;
	}

}

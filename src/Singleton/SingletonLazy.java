package Singleton;

public class SingletonLazy {
	
	private static class Singleton{ 
		private static SingletonLazy uniqueInstance = new SingletonLazy(); 
			
	} 
	
	
	public static SingletonLazy getInstance() {
		System.out.println("SingletonLazy Returned");
		return Singleton.uniqueInstance;

//		if(Singleton.uniqueInstance == null)
//			return Singleton.uniqueInstance = new SingletonLazy();
//		else
//			return Singleton.uniqueInstance;
	}
		
	private SingletonLazy() {}

}

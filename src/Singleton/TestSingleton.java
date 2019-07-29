package Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.setData(23);
		System.out.println(s1.getData());
		System.out.println(s2.getData());
		SingletonLazy sl1 = SingletonLazy.getInstance();
		
		System.out.println(sl1);
		
		SingletonEnum se = SingletonEnum.INSTANCE;
		se.setValue(30);
		System.out.println(se.getValue());
	}

}

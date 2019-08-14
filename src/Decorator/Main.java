package Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IListProfiler profiler = new LinkedListProfiler(new ArrayListProfiler(new ConcreteProfiler()));
		
		String s = "s";
		
		
		profiler.add(s);
		profiler.contains(s);
		profiler.size();
		profiler.remove(s);
		
		profiler.record();
		
	}

}

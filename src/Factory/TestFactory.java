package Factory;

public class TestFactory {
	public static void main(String[] args) {
		String[] type = {"console", "file", "email"};
		TraceFactory factory = SimpleTraceFactory.getFactory();
		Trace console = factory.createTrace(type[0]);
		Trace file = factory.createTrace(type[1]);
		factory.createTrace(type[2]);
		
		console.setDebug(true);
		System.out.println(console.getState());
		console.debug("Hello");
		console.error("Huh?");
		
		file.debug("Hello");
		System.out.println(file.getState());
		
	}
}

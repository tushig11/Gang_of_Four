package Factory;

public class SimpleTraceFactory implements TraceFactory{
	private static TraceFactory factory = new SimpleTraceFactory();
	
	private SimpleTraceFactory() {}
	
	public static TraceFactory getFactory() {
		return factory;
	}
	
	@Override
	public Trace createTrace(String type) {
		Trace trace = null;
		if(type.equals("console"))
			trace = new ConsoleTrace();
		else if(type.equals("file"))
			trace = new FileTrace();
		else
			System.out.println("Type "+type+" not exists!");
		return trace;
	}

}

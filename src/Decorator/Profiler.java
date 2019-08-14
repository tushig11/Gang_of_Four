package Decorator;

public abstract class Profiler implements IListProfiler {
	protected IListProfiler profiler;
	protected long addElapsedTime, removeElapsedTime, containsElapsedTime, sizeElapsedTime;

	
	public Profiler(IListProfiler profiler)
	{
		this.profiler = profiler;
	}
	
	@Override
	public boolean add(String s)
	{
		return profiler.add(s);
	}
	
	@Override
	public boolean remove(String s)
	{
		return profiler.remove(s);
	}
	
	@Override
	public boolean contains(String s)
	{
		return profiler.contains(s);
	}
	
	@Override
	public int size()
	{
		return profiler.size();
	}
	
	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println(" added in " +  addElapsedTime + " ms.");
		System.out.println(" contains in " +  containsElapsedTime + " ms.");
		System.out.println(" size in " +  sizeElapsedTime + " ms.");
		System.out.println(" removed in " +  removeElapsedTime + " ms.");
		
	}
	
	public long startTime()
	{
		return System.currentTimeMillis();
	}
	
	public long elapsedTime(long startTime)
	{
		return System.currentTimeMillis() - startTime;
	}

}

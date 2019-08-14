package Decorator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProfiler extends Profiler {
	private List<String> list;

	public ArrayListProfiler(IListProfiler profiler) {
		super(profiler);
		list = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean add(String s)
	{
		long startTime = startTime();
		
		super.add(s);
		boolean added = arrayListAdd(s);
		
		addElapsedTime = elapsedTime(startTime);
		
		return added;
		 
	}
	
	
	@Override
	public boolean remove(String s)
	{
		long startTime = startTime();
		
		super.remove(s);
		boolean removed = arrayListRemove(s);
		
		removeElapsedTime = elapsedTime(startTime);
		
		return removed;
	}
	
	@Override
	public boolean contains(String s)
	{
		long startTime = startTime();
		
		super.contains(s);
		boolean contains = arrayListContains(s);
		
		containsElapsedTime = elapsedTime(startTime);
		
		return contains;
	}
	
	@Override
	public int size()
	{
		long startTime = startTime();
		
		super.size();
		int size = arrayListSize();
		
		sizeElapsedTime = elapsedTime(startTime);
		
		return size;
	}
	
	private boolean arrayListAdd(String s)
	{
		return list.add(s);
	}
	
	private boolean arrayListRemove(String s)
	{
		return list.remove(s);

	}
	
	private boolean arrayListContains(String s)
	{
		return list.contains(s);
	}
	
	private int arrayListSize()
	{
		return list.size();
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<<ArrayList>>>>>>>>>");
		super.record();
	}

}

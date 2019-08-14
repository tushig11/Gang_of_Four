package Decorator;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProfiler extends Profiler {

	private List<String> list;
	
	public LinkedListProfiler(IListProfiler profiler) {
		super(profiler);
		// TODO Auto-generated constructor stub
		list = new LinkedList<>();
	}

	@Override
	public boolean add(String s)
	{
		long startTime = startTime();
		System.out.println(startTime);
		
		super.add(s);
		boolean added = linkedListAdd(s);
		
		addElapsedTime = elapsedTime(startTime);
		System.out.println(addElapsedTime);
		
		return added;
	}
	
	
	@Override
	public boolean remove(String s)
	{
		long startTime = startTime();
		
		super.remove(s);
		boolean remove = linkedListRemove(s);
		
		removeElapsedTime = elapsedTime(startTime);
		
		return remove;
	}
	
	@Override
	public boolean contains(String s)
	{
		long startTime = startTime();
		
		super.contains(s);
		boolean contains = linkedListContains(s);
		
		containsElapsedTime = elapsedTime(startTime);
		
		return contains;
	}
	
	@Override
	public int size()
	{
		long startTime = startTime();
		
		super.size();
		int size = linkedListSize();
		
		sizeElapsedTime = elapsedTime(startTime);
		
		return size;
	}
	
	private boolean linkedListAdd(String s)
	{
		return list.add(s);
	}
	
	private boolean linkedListRemove(String s)
	{
		return list.remove(s);

	}
	
	private boolean linkedListContains(String s)
	{
		return list.contains(s);
	}
	
	private int linkedListSize()
	{
		return list.size();
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<<<Linked List>>>>>>>>");
		super.record();
	}
}

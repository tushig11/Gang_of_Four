package Decorator;

public interface IListProfiler {
	boolean add(String s);
	boolean remove(String s);
	boolean contains(String s);
	int size();
	void record();
}

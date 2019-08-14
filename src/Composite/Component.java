package Composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
	protected Collection<Component> list = new ArrayList<Component>();
	protected String tagHead;
	protected String tagTail;
	public Component(String tagHead, String tagTail) {
		this.tagHead = tagHead;
		this.tagTail = tagTail;
	}
	
	public abstract void print();
	public void addItem(Component item)
	{
		list.add(item);
	}
}

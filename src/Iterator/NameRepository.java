package Iterator;


/* Suppose the name repository in the above example uses a 2-dimensional array to store the names.
Names can be dynamically added or removed from it. 
When you remove a name, you simply replace the name with a “-”. 
(You do not need to implement the add/remove methods though). 
Rewrite the NameIterator class that implements the same Iterator interface. 
But make sure that a “-” is never returned by the next() method. */

public class NameRepository implements Aggregate{
	private String names[][] = {{"+", "Rob"} , {"-", "Ben"} ,{"-", "Jul"} , {"+", "Pat"}, {"+", "Ken"}};
	//other methods of the NameRepository
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	private class NameIterator implements Iterator {
		int index;
		@Override
		public boolean hasNext() {
			
			if(index < names.length){
				boolean inValid = names[index][0].equals("-");
				if(inValid && index+1 != names.length)
					index++;
					if(inValid && index+1==names.length)
						return false;
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
			if(this.hasNext()){
				if(names[index][0].equals("-") && index+1 != names.length)
					index++;
				return names[index++][1];
			}
			return null;
		}
	}
	
}

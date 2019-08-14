package Composite;

public class Composite extends Component {

	public Composite(String tagHead, String tagTail) {
		// TODO Auto-generated constructor stub
		super(tagHead, tagTail);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(tagHead);
		
		for(Component item : list)
		{
			item.print();
		}
		
		System.out.println(tagTail);
	}

}

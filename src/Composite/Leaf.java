package Composite;

public class Leaf extends Component {

	public Leaf(String tagHead, String tagTail) {
		super(tagHead, tagTail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(tagHead);
		System.out.println(tagTail);
	}

}

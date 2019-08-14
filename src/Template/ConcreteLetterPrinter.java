package Template;


public class ConcreteLetterPrinter extends LetterPrinter {

	@Override
	public SymmetryType getType() {
		// TODO Auto-generated method stub
		switch(dataList.get(0))
		{
		case "NONE":
			type = SymmetryType.NONE;
			break;
		case "VERTICAL":
			type = SymmetryType.VERTICAL;
			break;
		case "HORIZONTAL":
			type = SymmetryType.HORIZONTAL;
			break;
			default:
				type = SymmetryType.NONE;
		}
		
		return type;
	}

	@Override
	public void reconstruct() {
		if(getType().equals(SymmetryType.VERTICAL))
		{
			for(int i = 5; i < dataList.size(); i++)
			{
				StringBuilder revString = new StringBuilder();
				revString.append(dataList.get(i));
				revString = revString.reverse();
				dataList.set(i, dataList.get(i) + revString);
			}
		}
		else if(getType().equals(SymmetryType.HORIZONTAL))
		{
			int size = dataList.size();
			
			for(int i = 6; i < size; i++)
			{
				int idx = (size - 1) - i + 6;
				dataList.add(dataList.get(idx));
			}
		}
		else if(getType().equals(SymmetryType.NONE))
		{
			
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(String data : dataList)
		{
			System.out.println(data);
		}
		dataList.clear();
	}

}

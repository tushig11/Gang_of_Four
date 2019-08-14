package Command;

import java.util.ArrayList;
import java.util.List;

public class CreateCommand implements Command {
	private Square square;
	private List<Square> list;
	
	public CreateCommand(Square square)
	{
		this.square = square;
		list = new ArrayList<>();
	}
	
	@Override
	public void execute(int unit) {
		// TODO Auto-generated method stub
		square.create(unit);
		list.add(square);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		list.remove(0);
	}

}

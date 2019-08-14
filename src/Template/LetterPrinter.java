package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class LetterPrinter {
	protected List<String> dataList = new ArrayList<>();
	protected SymmetryType type;
	
	public final void printLetter(String fl)
	{
		readData(fl);
		
		getType();
		
		reconstruct();
		
		print();
	}
	
	private void readData(String file)
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new java.io.FileReader(file));
			
			String line = reader.readLine();
			while (line != null) {
				dataList.add(line);
				// read next line
				line = reader.readLine();
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public abstract SymmetryType getType();
	
	public abstract void reconstruct();
	
	public abstract void print();
}

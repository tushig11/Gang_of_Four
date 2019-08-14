package Memento;

import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		
	}
	
	private JButton saveBut, undoBut, loadBut;
	private JTextArea theArticle = new JTextArea(40, 60);
	
	Caretaker caretaker = new Caretaker();
	
	Originator originator = new Originator();
	
	int saveFiles = 0, currentArticle = 0;
	
	public Main() {
		this.setSize(650, 780);
		this.setTitle("Memento Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		
		panel1.add(new JLabel("Profile"));
		
		panel1.add(theArticle);
		
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener loadListener = new ButtonListener();
		
		loadBut = new JButton("Load");
		loadBut.addActionListener(loadListener);
		
		saveBut = new JButton("Save");
		saveBut.addActionListener(saveListener);
		
		undoBut = new JButton("Undo");
		undoBut.addActionListener(undoListener);
		

		panel1.add(loadBut);
		panel1.add(saveBut);
		panel1.add(undoBut);
		
		
		this.add(panel1);
		this.setVisible(true);
	}
	
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == saveBut)
			{
				String textInTA = theArticle.getText();
				
				originator.set(textInTA);
				
				caretaker.addMemento(originator.storeInMemento());
				
				saveFiles++;
				currentArticle++;
				
				System.out.println("Save Files " + saveFiles);
				
				undoBut.setEnabled(true);
			} else {
				if(e.getSource() == undoBut)
				{
					if(currentArticle >= 1)
					{
						currentArticle--;
						
						String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
						
						theArticle.setText(textBoxString);
						
						loadBut.setEnabled(true);
					} else {
						undoBut.setEnabled(false);
					}
				}
				else {
					if(e.getSource() == loadBut)
					{
						if((saveFiles - 1)> currentArticle) {
							currentArticle++;
							
							String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
							
							theArticle.setText(textBoxString);
							
							undoBut.setEnabled(true);
						} else {
							loadBut.setEnabled(false);
						}
					}
				}
			} 
		}
	}
}

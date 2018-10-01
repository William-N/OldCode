package submission;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextEditorGUI 
{
	
	private JTextArea textArea;
	private JTextField fileNameInput;
	
	public TextEditorGUI()
	{
		
		this.textArea=new JTextArea(30,60);
		this.fileNameInput=new JTextField(10);
		
	}
	
	public JPanel getTextAreaPanel()
	{
		
		JPanel panel=new JPanel();
		panel.add(this.textArea);
		return panel;
		
	}
	
	public JPanel getButtonsPanel()
	{
		
		JPanel panel=new JPanel();
		
		panel.add(this.fileNameInput);
		
		JButton loadButton=new JButton("load");
		loadButton.addActionListener(new LoadListener(this.fileNameInput, this.textArea));
		panel.add(loadButton);
		
		JButton saveButton=new JButton("save");
		saveButton.addActionListener(new SaveListener(this.fileNameInput, this.textArea));
		panel.add(saveButton);
		
		return panel;
		
	}
	
}

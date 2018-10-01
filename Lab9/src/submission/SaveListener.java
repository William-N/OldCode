package submission;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SaveListener implements ActionListener
{
	
	private JTextField fileNameField;
	private JTextArea contentArea;
	
	public SaveListener(JTextField fileNameFieldParam, JTextArea contentAreaParam)
	{
		
		this.fileNameField=fileNameFieldParam;
		this.contentArea=contentAreaParam;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		FileUtils.save(this.fileNameField.getText(), this.contentArea.getText());
		
	}
	
}

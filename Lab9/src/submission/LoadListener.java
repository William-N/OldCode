package submission;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoadListener implements ActionListener
{
	
	private JTextField fileNameField;
	private JTextArea contentArea;
	
	public LoadListener(JTextField fileNameFieldParam, JTextArea contentAreaParam)
	{
		
		this.fileNameField=fileNameFieldParam;
		this.contentArea=contentAreaParam;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{

		String loadIt=FileUtils.load(fileNameField.getText());
		contentArea.setText(loadIt);
		
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class testGUI4 
{
	
    public static void runGUI()
    {
    		
    		JFrame frame=new JFrame();
    		JPanel panel=new JPanel();
    		JComboBox<String> dropDown=new JComboBox<>();
    		JLabel label=new JLabel();
    		JButton button=new JButton("button");
    		
    		dropDown.addItem("strengthen");
    		dropDown.addItem("have");
    		dropDown.addItem("content");
    		
    		button.addActionListener(new ActionListener()
    				{
    			@Override
    			public void actionPerformed(ActionEvent e)
    			{
    				
    				String setIt=(String) dropDown.getSelectedItem();
    				label.setText(setIt);
    			}
    				});
    		
    		
    		panel.add(dropDown);
    		panel.add(button);
    		panel.add(label);
    		frame.add(panel);
    		frame.setSize(600,400);
    		frame.getContentPane().add(panel);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    		
    }
	
    public static void main(String[] args)
    {
    	
    		SwingUtilities.invokeLater(new Runnable()
    				{
    			@Override
    			public void run()
    			{
    				runGUI();
    			}
    				});
    		
    }
    
}

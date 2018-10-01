import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class testGUI5 
{
	
	public static void runGUI()
	{
		
		JFrame frame=new JFrame();
		frame.setSize(600,400);
		frame.getContentPane().add(q1());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	public static JPanel q1()
    {
    		
    		ImageIcon image=null;
    		String urlString="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
    		JPanel panel=new JPanel();
    		JLabel label1=new JLabel();
    		JLabel label2=new JLabel();
    		
    		try
    		{
    			
        		URL url=new URL(urlString);
        		image=new ImageIcon(url);
	
    		}
    		catch(IOException ex)
    		{
    			
    			ex.printStackTrace();
    			
    		}
    		
    		JLabel label3=new JLabel(image);
    		label1.setText("talented steel");
    		label2.setText("fixed small");
    		
    		panel.add(label1);
    		panel.add(label2);
    		panel.add(label3);
    		
    		return panel;
    		
    }
	
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable()
				{

			@Override
			public void run() {
				runGUI();				
			}
			
				});
		
	}
	
	
}

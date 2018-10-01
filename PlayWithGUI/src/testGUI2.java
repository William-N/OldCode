import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class testGUI2 
{
	
	public static void runGUI()
	{
		
		JFrame frame=new JFrame();
		
		String longURL="https://www.buffalo.edu/content/www/brand/identity/university-logo-and-marks/jcr:content/par/image_1.img.438.auto.q65.png/1460123370265.png";
		ImageIcon image=null;

		try 
		{
			URL url=new URL(longURL);
			image=new ImageIcon(url);

		}
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		

		JPanel panel=new JPanel();
		JLabel label1=new JLabel();
		JLabel label2=new JLabel();
		JLabel label3=new JLabel(image);
		
		label1.setText("legitimate policy");
		label2.setText("apparent adoption");
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		frame.setSize(400,600);
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Comparator;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

public class TestingGrounds46 
{
    
    
    /**
     * Note: In this problem set level you will use inner classes by defining custom classes 
     * inside the ProblemSet_wfnichol_0046 class. This is only done so you can submit multiple 
     * classes in a single java file on AutoLab. In most cases it is better practice to define 
     * each class in a separate file instead of using inner classes.
     * 
     * For labs and projects you will write your classes in separate files and submit a single 
     * jar file containing your entire project
     */
    
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	

	public static String postRequest(String url, String body, boolean json){
	    String response = "";
	    try{
	        ContentType type = ContentType.DEFAULT_TEXT;
	        if(json){
	            type = ContentType.APPLICATION_JSON;
	        }
	        response = Request.Post(url).bodyString(body, type).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }
	    return response;
	}
    
    /**
     * q1: Write a public static method named q1 that takes a String as a parameter and returns 
     * an int. This method will first send a POST request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-five" where the text in the body of the request 
     * is a CSV formatted string containing the Strings "warm" then the String from the input of 
     * this method (do not include any quotes or spaces in your request String). The response 
     * from the server will be a CSV formatted String with either three or four values that are 
     * well formed ints. Parse these values and send them back to the server in a GET request to 
     * the same url but with a query String with the values from the first server response and 
     * names corresponding to the value positions as "first", "second", "third", or "fourth". For 
     * example, if the POST response is "6,32,1,28" then your query String for the GET request 
     * should be "first=6&second=32&third=1&fourth=28". Finally, return the server's response to 
     * the GET request which will be a well-formed int
     */
    public static int q1(String blah)
    {
    		
    		String postURL="https://fury.cse.buffalo.edu/ps-api/type-five";
    		String postText="warm,"+blah;
    		
    		String postReturn=postRequest(postURL,postText,false);
    		String[] postArray=postReturn.split(",");
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-five?first="+postArray[0]+"&second="+postArray[1]+"&third="+postArray[2];
    		
    		if(postArray.length==4)
    			getURL=getURL+"&fourth="+postArray[3];
    		
    		return Integer.parseInt(getRequest(getURL));
    		
    }
    
    
    
    /**
     * q2: Write a public static method named q2 that takes an int as a parameter and returns an 
     * int. This method will first send a GET request to a server with the url 
     * "https://fury.cse.buffalo.edu/ps-api/type-four" and a query String with three int values 
     * of 98, 92 and the input parameter of this method in this order with names of "first", 
     * "second", and "third" respectively. The response from the server will be a CSV formatted 
     * String with two well-formed ints as values. Then make a POST request to the same url (no 
     * query String) where the text in the body of the request is a CSV String containing the 
     * same two values from the response of the GET request but in the reverse order. For 
     * example, if the response from the GET request was "75,36", then the body of your POST 
     * request should be "36,75". The response from the POST request will again be a CSV String 
     * with two well-formed ints. Finally, return the sum of the two ints in the response of the 
     * POST request
     */
    public static int q2(int input)
    {
    		
    		String getURL="https://fury.cse.buffalo.edu/ps-api/type-four?first=98&second=92&third="+input;
    		String returnText=getRequest(getURL);
    		
    		String[] returnArray=returnText.split(",");
    		
    		String postURL="https://fury.cse.buffalo.edu/ps-api/type-four";
    		String postText=returnArray[1]+","+returnArray[0];
    		
    		String postReturnText=postRequest(postURL,postText,false);
    		String[] returnValue=postReturnText.split(",");
    		
    		return Integer.parseInt(returnValue[0])+Integer.parseInt(returnValue[1]);
    		
    }
    
    
    
    /**
     * q3: Write a public class named PrescriptionListener that implements the ActionListener 
     * interface. This class will have a public constructor that takes a JTextField and a JLabel 
     * as parameters and stores these in instance variables. Override the actionPerformed method 
     * to interpret the text on the JTextField as an x-value (as a double) and display the 
     * corresponding y-value on the JLabel for the line with slope 0.33 and y-intercept 5.05.
     * 
     * Note that creating classes that implement listener interfaces we can add the same 
     * functionality to multiple components by creating multiple instances of this class. For 
     * example, if we want 3 buttons that will compute y-values for this line with x-values from 
     * different text fields we can instantiate this class 3 times and attach each instance to a 
     * different button.
     */
    public class PrescriptionListener implements ActionListener
    {
    		
    		private JTextField textField;
    		private JLabel label;
    		
    		public PrescriptionListener(JTextField textField, JLabel label)
    		{
    			
    			this.textField=textField;
    			this.label=label;
    			
    		}

    		
    		
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			
			double x=Double.parseDouble(this.textField.getText());
			double slope=0.33;
			double y_int=5.05;
			
			double y=(slope*x)+y_int;
			
			this.label.setText(y+"");
			
		}
    		
    }
    
    
    
    /**
     * q4: Write a public interface named LocationInterface with abstract methods named "waste", 
     * "subject", "privilege", and "disclose" all of which take no parameters and have return 
     * type int. Then write a public class named LocationComparator that implements the 
     * Comparator interface with LocationInterface as the type parameter. Then implement the 
     * compare method such that it will sort instances that implement LocationInterface by the 
     * return value of "privilege" in increasing order when used as the comparator in a call to 
     * Collections.sort
     */
    public interface LocationInterface
    {
    		
    		abstract int waste();
    		abstract int subject();
    		abstract int privilege();
    		abstract int disclose();
    		
    }
    
    
    public class LocationComparator implements Comparator<LocationInterface>
    {

		@Override
		public int compare(LocationInterface arg0, LocationInterface arg1) 
		{
			
			if(arg0.privilege()>arg1.privilege())
				return 1;
			else if(arg0.privilege()<arg1.privilege())
				return -1;
			else
				return 0;
			
		}
    		
    }
    
    
    
    /**
     * q5: Write a public class named SphereMouseListener that implements the MouseListener 
     * interface. This class will have a public constructor that takes a JTextArea and a JLabel 
     * as parameters and stores these in instance variables. Override the mouseClicked method to 
     * display the text from the JTextArea on the JLabel in all upper case letters. Then, 
     * override the mouseReleased method to display the text from the JTextArea on the JLabel in 
     * all lower case letters. The other three methods from the MouseListener interface can be 
     * left empty
     */
    public class SphereMouseListener implements MouseListener
    {
    		
    		private JTextField textField;
    		private JLabel label;
    		
    		public SphereMouseListener(JTextField textField, JLabel label)
    		{
    			
    			this.textField=textField;
    			this.label=label;
    			
    		}
    		
    		
		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			this.label.setText(this.textField.getText().toUpperCase());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			this.label.setText(this.textField.getText().toLowerCase());

			
		}
    		
    		
    		
    }
    
    
    
    public static void main(String[] args)
    {
        
        /* Use the following syntax to instantiate your inner class for testing */
        //ProblemSet_wfnichol_0046 outerInstance = new ProblemSet_wfnichol_0046();
        //InnerClassName innerInstance = outerInstance.new InnerClassName();
        
        /* Test your code here to verify it is correct before submitting */
        
    }
}

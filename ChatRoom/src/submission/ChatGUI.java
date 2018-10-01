package submission;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

public class ChatGUI 
{
		
	protected String APIAddress;
	protected JButton send;
	protected JButton refresh;
	protected JTextArea textArea;
	
	public ChatGUI(String APIAddress)
	{
		
		this.APIAddress=APIAddress;
		this.textArea=new JTextArea(10,10);
		
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
	
	
	public static String getRequest(String url){
	    String response = "";

	    try{
	        response = Request.Get(url).execute().returnContent().asString();
	    }catch(IOException ex){
	        ex.printStackTrace();
	    }

	    return response;
	}
	
	
	public JPanel getControlPanel()
	{
		
		JPanel chatBox=new JPanel();
		JTextField usernameField=new JTextField(8);
		JTextField messageField=new JTextField(22);
		String address=this.APIAddress;
		this.send=new JButton("SEND");
		this.refresh=new JButton("REFRESH");
	
		
		send.addActionListener(new ActionListener()
				{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String username=usernameField.getText();
				String message=messageField.getText();
				String sendThis=username+"\n"+message;
				
				System.out.println(address+"postMessage");
				
				String postRequest=postRequest(address+"postMessage", sendThis, false);
				
				messageField.setText("");
				
			}
			
				});
		
		
		
		
		
		refresh.addActionListener(new ActionListener()
				{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String getText=getRequest(APIAddress+"getMessages?n=50");
				JsonValue value=Json.parse(getText);
				JsonArray array=value.asArray();
				
				textArea.setText("");
				
				for(int i=0; i<array.size(); i++)
				{
					
					JsonObject currentMessage=array.get(i).asObject();
					
					String username=currentMessage.get("username").asString();
					String message=currentMessage.get("message").asString();
					
					long timestamp=currentMessage.get("timestamp").asLong();
					long date=timestamp * 1000;
					String readableDate=new SimpleDateFormat("MMM d @ h:mm:ss a").format(date);
					
					String lineMessage= "["+readableDate+"] "+username+": "+message;
					
						textArea.append("\n"+lineMessage);							
					
				}
				
			}
			
				});
		
		
		chatBox.add(usernameField);
		chatBox.add(messageField);
		chatBox.add(send);
		chatBox.add(refresh);
		
		return chatBox;
		
	}
	
	
	public JPanel getChatPanel()
	{
		
		JPanel textBox=new JPanel();		
		String getText=getRequest(this.APIAddress+"getMessages?n=50");
		System.out.println(getText);
		JsonValue value=Json.parse(getText);
		JsonArray array=value.asArray();
		textArea.setText("");
		
		for(int i=0; i<array.size(); i++)
		{
			
			JsonObject currentMessage=array.get(i).asObject();
			
			String username=currentMessage.get("username").asString();
			String message=currentMessage.get("message").asString();
			
			long timestamp=currentMessage.get("timestamp").asLong();
			long date=timestamp * 1000;
			String readableDate=new SimpleDateFormat("MMM d @ h:mm:ss a").format(date);
			
			String lineMessage= "["+readableDate+"] "+username+": "+message;

			textArea.append("\n"+lineMessage);											
			
			
		}
		
		System.out.println(textArea.getText());
		
		
		
		textBox.add(textArea);
		return textBox;
		
	}
	
}

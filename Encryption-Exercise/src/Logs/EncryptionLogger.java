package Logs;

import java.util.Observable;
import java.util.Observer;
import FileEncryptorPackage.*;

public class EncryptionLogger implements Observer
{
	public void update(Observable o ,Object obj)
	{
		  if(obj instanceof EncryptionLogEventArgs) {  
	          // get the seconds from arg and use it  
			  EncryptionLogEventArgs t = (EncryptionLogEventArgs) obj;
	         System.out.println( t.toString());
		  }		
 	}
}

package UI;
import java.util.Scanner;
import ExceptionPackage.InvalidExceptionKeyException;




public class LaunchPorject {
	
	
	public LaunchPorject() throws InvalidExceptionKeyException
	{
		try
		{
			InvalidExceptionKeyException ex = new InvalidExceptionKeyException();
			if(5>4)
			throw ex;
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int midterm = Integer.parseInt(s);
  
     
		}
		catch (InvalidExceptionKeyException ex)
		{
			
			ex.printStackTrace();
		}
		
	}

}

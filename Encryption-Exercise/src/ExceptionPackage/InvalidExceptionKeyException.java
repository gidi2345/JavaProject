package ExceptionPackage;

public class InvalidExceptionKeyException extends Exception
{
	public InvalidExceptionKeyException()
	{
		super("The key is not in the correct format");
	}
	
}

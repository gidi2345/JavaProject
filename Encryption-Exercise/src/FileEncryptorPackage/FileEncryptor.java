package FileEncryptorPackage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Observable;

import EncryptionADecryption.*;
import Logs.*;
/*
 * The Class implement can be much simple , as if we use no string buffer between 
 * the mid but it more sense and readable in that form
 * 
 */
public class FileEncryptor extends Observable
{

	public FileEncryptor()
	{
		
		
	}
	
	public void FileEncryption(Encryption EncryptionAlg,int Key,String SourcePath,String DestinationPath) throws IOException
	{
		// Convert file content's to string 
		String SourceFile=readFrom(SourcePath);
		// returns the time that take the code to run 
		 long startTime = System.nanoTime();
		    // Encrypt the content by the chosen algorithm
			String FileAfterEncryption = EncryptionAlg.EncryptionAlg(Key, SourceFile);
		 long estimatedTime = System.nanoTime() - startTime;
		 EncryptionStarted(new EncryptionLogEventArgs(SourcePath,EncryptionAlg.toString(),estimatedTime));
		// Write the Encrypt content that now stored in string format to a new file in destantion that the user chose
		writeTo(DestinationPath,FileAfterEncryption);
	}
	
	public void  EncryptionStarted(EncryptionLogEventArgs EventArgs)
	{
		 setChanged();
		 notifyObservers(EventArgs);			
	}
	
	
	public void writeTo(String path, String content) throws IOException
	{
	    Path target = Paths.get(path);
	     if (Files.exists(target))
	     {
	        throw new IOException("file already exists");
	     }
	    Files.copy(new ByteArrayInputStream(content.getBytes("UTF8")), target);
	}
	
	public String readFrom(String path) throws IOException
	{
        return new String(Files.readAllBytes(Paths.get(path)));
		
	}

}

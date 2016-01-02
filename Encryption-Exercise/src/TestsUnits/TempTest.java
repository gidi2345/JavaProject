package TestsUnits;
import FileEncryptorPackage.FileEncryptor;
import UI.*;
import Logs.*;
import java.io.IOException;
import org.apache.log4j.Logger;

import EncryptionADecryption.ShiftUpEncryption;
import ExceptionPackage.InvalidExceptionKeyException;





public class TempTest {

static String FileBeforeEncryption="C:\\jav\\FileBefore.txt";
static String FileAfterEncryption="C:\\jav\\FileAfter.txt";

public static void mzz() throws IOException
{
	Logger logger = Logger.getLogger(MyclassName.class);
	 logger.debug("this is a sample log message.");
   EncryptionLogger logger1 =new EncryptionLogger();
   FileEncryptor fe=new FileEncryptor();
   ShiftUpEncryption alg=new ShiftUpEncryption();    
   fe.addObserver(logger1);
   fe.FileEncryption(alg, 7, FileBeforeEncryption, FileAfterEncryption);
	
}


}

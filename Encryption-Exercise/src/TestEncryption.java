import static org.junit.Assert.*;

import org.junit.Test;

public class TestEncryption {

	@Test
	public void EncryptionTest()
	{
	
	String StrToTest="ddd";
	MultiplyEncryption EncryptionObj=new MultiplyEncryption();
	
	//assertTrue(EncryptionObj.getKey()<257 && EncryptionObj.getKey>-258);
	assertEquals(StrToTest,EncryptionObj.EncryptionAlg(2, "222".toCharArray()));	
	}
	
	



}

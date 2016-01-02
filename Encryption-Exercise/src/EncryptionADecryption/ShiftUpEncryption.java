package EncryptionADecryption;

public class ShiftUpEncryption implements Encryption
{
	  @Override public int apply(int x1, int x2) {
          return x1 + x2;
      }
	
}

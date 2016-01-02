package EncryptionADecryption;

public class XorEncryption implements Encryption
{
	  @Override public int apply(int x1, int x2) {
          return x1 ^ x2;
      }

}

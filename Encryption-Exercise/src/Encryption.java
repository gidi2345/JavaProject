
public interface Encryption
{
  public abstract int apply(int x1, int x2);
  default String EncryptionAlg(int Key, String StrBeforeEncrypt)
    {
	  char [] Str =StrBeforeEncrypt.toCharArray();
	 for(int i=0 ;i<Str.length;i++) 
	   {
		 Str[i]=(char) (apply(Str[i],(byte)Key));		 
	   }
	 //return the value of the string
 	 return String.valueOf(Str);
	   
  }
}

package Logs;

public class EncryptionLogEventArgs
{
	protected String FileName,AlgName;
	protected long AlgRunTime;
	
	public EncryptionLogEventArgs(String ArgsFileName,String ArgsAlgName,long ArgsAlgRunTime)
	{
		FileName=ArgsFileName;
		AlgName=ArgsAlgName;
		AlgRunTime=ArgsAlgRunTime;		
	}
	
	@Override
	public String toString(){
		return String.format("The encryption for file" + FileName + "with algorithm" 
		+ AlgName + "took" + AlgRunTime	+ "seconds"	);
	}
	
}

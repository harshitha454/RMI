import java.rmi.*;
import java.rmi.server.*;
public class matServer
{
	public static void main(String agrs[])
	{
		try{
			matImp mi=new matImp();
			Naming.rebind("matrix",mi);
		 }
		catch(Exception e)
		{
			
		}
	}
}
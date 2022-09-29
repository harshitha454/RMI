import java.rmi.*;
import java.rmi.server.*;

public class fibServer 
{
 public static void main(String args[])
 {
 
	try
	{
		fibImp ai=new fibImp();
		Naming.rebind("fibb",ai);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
 }
}
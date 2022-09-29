import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class fibClient
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		try
		{
			
		fibInt fi=(fibInt)Naming.lookup("rmi://localhost/fibb");
		System.out.println("Enter the n value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=fi.fibo(n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
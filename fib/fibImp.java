import java.rmi.*;
import java.rmi.server.*;
public class fibImp extends UnicastRemoteObject implements fibInt
{
	fibImp() throws RemoteException
	{
	}
	public int[] fibo(int n) throws RemoteException
	{
		int a[]=new int[10];
		int f1,f2,f3;
		f1=0;
		f2=1;
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			a[i]=f3;
		}
		return a;
	
    }
}
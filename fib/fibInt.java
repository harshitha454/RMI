import java.rmi.*;
import java.rmi.server.*;
public interface fibInt extends Remote{
	public int[] fibo(int n) throws RemoteException;
}

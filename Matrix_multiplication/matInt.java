import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public interface matInt extends Remote
{
	public int[][] mul(int a[][],int b[][],int r1,int r2,int c1,int c2) 
	throws RemoteException;

}
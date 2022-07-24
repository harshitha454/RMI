import java.rmi.*;
import java.rmi.server.*;

public class matImp extends UnicastRemoteObject implements matInt
{
	matImp() throws RemoteException{}
	
	public int[][] mul(int a[][],int b[][],int r1,int r2,int c1,int c2)
	throws RemoteException
	{
	 int c[][]=new int[10][10];
	 
		 for(int i=0;i<r1;i++)
		  {
		    
			for(int j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<r2;k++)
				{
					
			
				c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		   }
		   return c;
	   }
	  
	}

	   
	   
import java.rmi.server.*;
import java.rmi.*;
import java.util.*;
public class matClient
{
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int r1,c1,r2,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for matrix1:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		
		System.out.println("enter the elements:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the number of rows and columns for matrix2:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		System.out.println("enter the elements:");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("matrix1=");
	    for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+"\t");	
			}
			System.out.println();
		}
		 System.out.println("matrix2=");
	    for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+"\t");
				
			}
			System.out.println();
		}
		  try
		  { 
			  if(r2==c1)
			  {
			    matInt mi=(matInt)Naming.lookup("rmi://localhost/matrix");
			    c=mi.mul(a,b,r1,r2,c1,c2);
			    System.out.println("Result");
			    for(int i=0;i<r1;i++)
		         {
			       for(int j=0;j<c2;j++)
			        {
				      System.out.print(c[i][j]+"\t");	
			        }
			       System.out.println();
		         }
			   }
			  else
			    {
				  System.out.println("multiplication not possible");
			    }
		  }
		
		 catch(Exception e)
		   {
		   }
	}
}
				 
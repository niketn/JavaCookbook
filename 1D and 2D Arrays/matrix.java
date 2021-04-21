import java.util.Scanner;
public class matrix
{
    public static void main(String args[])
	{
	   int a[][]=new int[10][10],b[][]=new int[10][10];
	   int c[][]=new int[10][10];
	   int r1,c1,r2,c2;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the no of rows and coloumn for matrix-1 :");
	   r1=s.nextInt();
	   c1=s.nextInt();
	   System.out.println("Enter the no of rows and coloumn for matrix-2 :");
	   r2=s.nextInt();
	   c2=s.nextInt();
	   System.out.println("enter the first matrix:");
	   for(int i=0;i<r1;i++)
	   {
		   for(int j=0;j<c1;j++)
		   {
			  a[i][j]=s.nextInt();
		   }
	   }  
       System.out.println("enter the second matrix:");
       for(int i=0;i<r2;i++)
	   {
		   for(int j=0;j<c2;j++)
		   {
			  b[i][j]=s.nextInt();
		   }
	   }  	   
	  if(c1==r2)
	  {
	     for(int i=0;i<r1;i++)
	    {
	      for(int j=0;j<c2;j++)
		  {
		     c[i][j]=0;
			 for(int k=0;k<c1;k++)
   		 	 c[i][j]=a[i][k]*b[k][j]+c[i][j];
		  }
	    }
	  }
	  else
	  System.out.println("multiplication cannot be performed");
  
      System.out.println("matrix after multiplication is:");
	  for(int i=0;i<r1;i++)
	    {
	      for(int j=0;j<c2;j++)
		  {
		    System.out.printf("%d  ",c[i][j]);
		  }
		  System.out.println("\n");	
	    }
    }
}
  
  
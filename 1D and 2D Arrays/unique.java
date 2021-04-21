import java.util.Scanner;
public class unique
{
   public static void main(String args[])
   {
     int [] un=new int[11];
	 int se,temp,j=0;;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter 11 unique numbers: " );
	 for(int i=0;i<11;i++)
	 {
	   un[i]=s.nextInt();
	 }
	 System.out.println("enter the no to b searched: ");
	 se=s.nextInt();
	
	 for(int i=0;i<11;i++)
	 { 
	   if(se==un[i])
	   {
	      System.out.println("the no is: " +un[i]);
		  temp=un[i];
		  j=i;
	   }
	 } 
	  for(int i=j;i<un.length-1;i++)
	  {
		 un[i]=un[i+1]; 
	  }
	  for(int i=0;i<un.length-1;i++)
	 { 
	  System.out.println(un[i]);
	 }
   }
}
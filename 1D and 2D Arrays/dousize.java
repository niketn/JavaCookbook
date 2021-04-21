import java.util.Scanner;
public class dousize
{
  public static double[] doublecapacity(double [] list)
  {
     double[] z=new double[2*list.length];
	 for(int i=0;i<list.length;i++)
	 z[i]=list[i];
	 list=z;
	 System.out.println("the updated size is: " +list.length);
	 return list;
  }
  public static void main(String args[])
  {
	  int n,i,x;Scanner s=new Scanner(System.in);
	  System.out.println("enter the no of  elements to b entered:");
	  n=s.nextInt();
     double [] ori=new double[n];
	 System.out.println("enter the array elements:");
	 for(i=0;i<ori.length;i++)
	 {
		ori[i]=s.nextDouble(); 
	 }
	 if(n==i)
	{
		do
		{
			System.out.println("Doubling the array:");
		    ori=doublecapacity(ori);
		    System.out.println("enter the array elements:");
		    while(n<ori.length)
	        {
			   ori[n]=s.nextDouble(); 
		       n++;
		    }
			System.out.println("Do you want to continue ? if yes press 1 and if no press 0 ");
			x=s.nextInt();
		}
		while(x==1);
	}
	 System.out.println("array after updated :");
	 for(i=0;i<ori.length;i++)
	 {
		 System.out.println(ori[i]);
	 }
  }  
}
import java.util.Scanner;
public class Reverse
{
   public static void revearr(int [] a,int st,int e)
   {
      int temp;
	  while(st<e)
	  {
	    temp=a[st];
		a[st]=a[e];
		a[e]=temp;
		st++;
		e--;
	  }
   }
   public static void main(String args[])
   {
      int no;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the no of elements: ");
	  no=s.nextInt();
	  int [] array=new int[no];
	  System.out.println("enter the numbers: ");
	  for(int i=0;i<no;i++)
	  {
	    array[i]=s.nextInt();
	  }
	  revearr(array,0,no-1);
	  System.out.printf(" the reversed array is:\n");
	  for(int i=0;i<no;i++)
	  {
	    System.out.println(array[i]);
	  }
   }
}
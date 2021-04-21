import java.util.Scanner;
public class unspecified
{
   public static int gcd(int...numbers)
   {
	   int r=0;
       for(int i=0;i<numbers.length;i++)
	   {
	     int a=(numbers[i]>numbers[i+1])?numbers[i]:numbers[i+1];
         int b=(numbers[i]<numbers[i+1])?numbers[i]:numbers[i+1];
         r=b;
           while(a%b!=0)
          {
             r=a%b;
             a=b;
             b=r;
          }
		  System.out.println("the gcd is: " +r);
	   } 
	   return r;
    }
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
	   int num[]={4,2,3,5,25,8,40};
     System.out.println("Gcd of two numbers="+gcd(num));
   }
}
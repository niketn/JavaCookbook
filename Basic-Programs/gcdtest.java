import java.util.Scanner;
public class gcdtest
{
  static int gcd(int x,int y)
  {
    int a=(x>y)?x:y;
    int b=(x<y)?x:y;
    int r=b;
    while(a%b!=0)
    {
      r=a%b;
      a=b;
      b=r;
    }
   return r;
 }
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the two numbers");
     int x=s.nextInt();
     int y=s.nextInt();
     System.out.println("Gcd of two numbers="+gcd(x,y));
  }
}
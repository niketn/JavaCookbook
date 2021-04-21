import java.util.Scanner;
import static java.lang.Math.sqrt;
public class distance
{
   public static void main(String args[])
   {
      double x2,x1,y1,y2;
	  double r;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the (x1,y1) cordinates ");
	  x1=s.nextInt();
	  y1=s.nextInt();
	  System.out.println("enter the (x2,y2) cordinates ");
	  x2=s.nextInt();
	  y2=s.nextInt();
	  r=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	  System.out.println("the distance between two points is:" +r);
   }
}
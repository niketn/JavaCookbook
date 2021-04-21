import java.util.*;
import static java.lang.Math.sqrt;
class Point
{
  private double x,y;
  public Point()
  {
    x=0;y=0;
  }
  public void setXY(double x,double y)
  {
    this.x=x;
	this.y=y;
  }
  public double getX()
  {
    return x;
  }
  public double getY()
  {
    return y;
  }
  public double distance(double x1,double y1)
   {
      double d;
	  d=Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
      return d;
   }
   public double distance(Point p)
   {
	   double d,PointX,PointY;
	   PointX =p.x;
	   PointY =p.y;
	   d=Math.sqrt((PointX-x)*(PointX-x) + (PointY-y)*(PointY-y));
	   return d;
   }
   public double distance()
   {
	   double d;
	   d=Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
	   return d;
   }
   public String toString()
   {
	   return "("+x+","+y+")";
   }
};
//((s[j].getX()).compareTo((s[j+1].getX())))>0
public class binobj
{
	public static Point [] sortArray(Point [] s)
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length-i-1;j++)
			{
			if(s[j].getX()>s[j+1].getX())
				{
					Point [] n;
					n = new Point[10];
					n[j] = s[j];
					s[j] = s[j+1];
					s[j+1] = n[j];
				}
			}
		}
		return s;
	}
	public static int binSearchh(Point [] s,double k,int low,int high)
	{
		if(low>high)
			return -1;
		if(low == high)
		{
			double lcp = s[low].getX();
			if(lcp == k)
				return low;
			else
				return -1;
		}
		else
		{
			int mid = (low+high)/2;
			double mcp = s[mid].getX();
			if(k == mcp)
				return mid;
			else if(k < mcp)
				return binSearchh(s,k,low,mid-1);
			return binSearchh(s,k,mid+1,high);
		}
	}
	public static void main(String args[])
	{
		Point [] s;int no;
		double a,b;
		System.out.println("enter the no of entries to be made: ");
		Scanner z=new Scanner(System.in);
		no=z.nextInt();s = new Point[no];
		for(int i=0;i<no;i++)
		{
			s[i]=new Point();
			System.out.println("enter the x and y coordinate: ");
			a=z.nextDouble();
			b=z.nextDouble();
			s[i].setXY(a,b);
		}
		s = sortArray(s);
		System.out.println("\nSorted:\n");
		for(int i=0;i<no;i++)
		{
		  System.out.println(s[i].toString());
		}
		int result = binSearchh(s,4,0,s.length-1);
		if(result != -1)
			System.out.println("\nResult of Binary Search:\n" + s[result].toString() + "\nat location " + (result+1) );
		else
			System.out.println("\nResult of Binary Search:\nNot found");
	}
}
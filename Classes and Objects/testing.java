import java.util.*;
import static java.lang.Math.sqrt;
class Point
{
  private double x,y;
  public Point()
  {
    x=0;y=0;
  }
  public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
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
   public double getDistance(Point p)
	{
		return	Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(y-p.y)));
	}
    public double getDistance()
	{
		return	Math.sqrt((x*x)+(y*y));
	}
   public String toString()
	{
		String a = "Point("+x+","+y+")";
		return a;
	}
  
};
public class testing
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
		Point p1 = new Point(4,4);
		Point p2 = new Point(8,4);
		
		System.out.println("P1: "+p1.toString());
		System.out.println("P2: "+p2.toString());
		System.out.println("P1 Distance P2: "+p2.getDistance(p1));
		
		System.out.println();
		
		p1.setXY(5,6);
		System.out.println("P1: "+p1.toString());
		System.out.println("P2: "+p2.toString());
		System.out.println("P1 Distance from P2: "+p1.getDistance(p2));
		
		System.out.println("P1 Distance from (0,0): "+p1.getDistance());
		System.out.println("P2 Distance from (0,0): "+p2.getDistance());
		
		Point [] s;int no;
		double a,b;
		System.out.println("\nEnter the no of entries to be made: ");
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

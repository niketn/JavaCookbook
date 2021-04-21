import java.util.Scanner;
import static java.lang.Math.sqrt;
class point
{
  private float x1,y1,d;
  public point()
  {
    x1=0;y1=0;
  }
  public void setXY(float x1,float y1)
  {
    this.x1=x1;
	this.y1=y1;
  }
  public float getX()
  {
    return x1;
  }
  public float getY()
  {
    return y1;
  }
  public float retdist()
  {
	  return d;
  }
  public void distance()
   {
      float x2,y2;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the x1 and y1 cordinate:");
	  x1=s.nextFloat();
	  y1=s.nextFloat();
	  System.out.println("enter the x2 and y2 cordinate:");
	  x2=s.nextFloat();
	  y2=s.nextFloat();
	  d=(float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	  System.out.println(" the distance between the given points is:  "+d);
   }
   public void distance(point p)
   {
	   float PointX,PointY;
	   point  p1=new point();
	   PointX =p1.x1;
	   PointY =p1.y1;
	   d=(float)Math.sqrt((PointX-x1)*(PointX-x1) + (PointY-y1)*(PointY-y1));
	   System.out.println(" the distance between the given points is:  "+d);
   }
   public String toString()
   {
	   return "(+x+,+y+)";
   }
   public float display()
   {
	   return d;
   }
};
public class testpoint                  
{
	public static void main(String args[])
	{
	   point [] p=new point[3];
	   point temp=new point();
	   int no,mid=0,find=-1,first=0;
	   float ser;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the no of elements to b enterned:");
	   no=s.nextInt();
	   int last=no-1;
	   System.out.println("enter the elements:");
	   for(int i=0;i<no;i++)
	   {
	       p[i]=new point();
		   p[i].distance();
		   //p[i].distance(p[i+1]);
	   }
	  for(int i=0;i<no;i++)
	   {
		  for(int j=0;j<no-i-1;j++)
		  {
			  if(p[j].retdist()>p[j+1].retdist())
			  {
				  temp=p[j];
				  p[j]=p[j+1];
				  p[j+1]=temp;
			  }
		  }	
	   }
	   System.out.println("the sorted list of distances:  ");
	   for(int i=0;i<no;i++)
	   {
          System.out.println(+p[i].display());
	   }
	   System.out.println("enter the distance to be searched: ");
	   ser=s.nextFloat();
	   for(int i=0;i<no;i++)
	   {
		  mid=(first+last)/2;
		  if(p[mid].retdist()==ser)
          {
            find=mid;
             break;
          }
          else
          if(p[mid].retdist()<ser)
          first=mid+1;
          else
          last=mid-1;
       }
        if(find>=0)
	    {
		  int z=find+1;
          System.out.println("The position of the element is : "+z);
		} 
        else
        System.out.println("Search not found");
	}
}

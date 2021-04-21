/*
 * @author (NIKET NAIK)
 */
import java.util.*;
class shape
{
    String color;
    boolean filled;
    public shape()
    {
        color="green";
        filled=true; 
    }
    public shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public String toString()
    {
        if(isFilled())
        return "A shape with color of "+getColor()+" and filled.";
        else
        return "A shape with color of "+getColor()+" and Not filled.";
    }
}
class Circle extends shape
{
    private double radius;
    public Circle()
    {
        radius =1.0;
    }
    public Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        super.color=color;
        super.filled=filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double rad)
    {
        radius=rad;
    }
     public double getArea()
    {
       double area;
       area=3.14*radius*radius;
       return area;
    }
    public double getPerimeter()
    {
       double peri;
       peri=2*3.14*radius;
       return peri;
    }
    public String toString()
    {
         return "A Circle with radius="+getRadius()+ "which is a subclass of "+super.toString();
    }
}
class Rectangle extends shape
{
    private double length,width;
    public Rectangle()
    {
        length=1.0;
        width=1.0;
    }
    public Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
        super.color=color;
        super.filled=filled;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double len)
    {
        length=len;
    }
    public void setWidth(double wid)
    {
        width=wid;
    }
    public double getArea()
    {
       double area;
       area=length*width;
       return area;
    }
    public double getPerimeter()
    {
       double peri;
       peri=2*(length+width);
       return peri;
    }
    public String toString()
    {
         return "A Rectangle with width="+getWidth()+ "and length="+getLength()+" which is a subclass of "+super.toString();
    }
}
class Square extends Rectangle
{
    public Square(double side)
    {
        super(side,side);
    }
    public Square()
    {
        super();
    }
    public double getSide()
    {
        return getWidth();
    }
    public void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString()
    {
         return "A Square with side="+getSide()+" which is a subclass of "+super.toString();
    }
}
public class GeoTest
{
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int ch,noc,nor,nos,i;
		double rd,rdd;
		String st;
		boolean b;
		 System.out.println("enter the no of entries for circle: ");
         noc=s.nextInt();
		 System.out.println("enter the no of entries for rectangle: ");
		 nor=s.nextInt();
		 System.out.println("enter the no of entries for square: ");
		 nos=s.nextInt();
		 Circle c[]=new Circle[noc];
		 Rectangle r[]=new Rectangle[nor];
		 Square sq[]=new Square[nos];
		do
		{     
		   
			System.out.println("\n 1.Circle \n 2.Rectangle \n 3.Square \n 4.Area and perimeter of circle \n 5.Area and perimeter of rectangle \n 6.Area and perimeter of square \n 7.Display similar areas of Square and Circle \n 8.Exit\n");
		    System.out.println("enter your choice ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				for(i=0;i<noc;i++)
				{
					System.out.println("enter the radius of the circle: ");
					rd=s.nextDouble();
					System.out.println("enter the color of the circle: ");
					st=s.next();
					System.out.println("enter (true/false) if shape is filled or not filled resp: ");
					b=s.nextBoolean();
					c[i]=new Circle(rd,st,b);
				}
				
				break;
				case 2:
				
				for(i=0;i<nor;i++)
				{
					System.out.println("enter the width and length of a rectangle: ");
					rd=s.nextDouble();rdd=s.nextDouble();
					System.out.println("enter the color of the rectangle: ");
					st=s.next();
					System.out.println("enter (true/false) if shape is filled or not filled resp: ");
					b=s.nextBoolean();
					r[i]=new Rectangle(rd,rdd,st,b);
				}
				
				break;
				case 3:
				for(i=0;i<nos;i++)
				{
					System.out.println("enter the side of the square: ");
					rd=s.nextDouble();
					System.out.println("enter the color of the square: ");
					st=s.next();
					System.out.println("enter (true/false) if shape is filled or not filled resp: ");
					b=s.nextBoolean();
					sq[i]=new Square(rd);
				}
				
				break;
				case 4:
				for(i=0;i<noc;i++)
				{
					System.out.println("The area="+c[i].getArea()+" and perimeter="+c[i].getPerimeter()+"of circle" +""+ (i+1));
					System.out.println(c[i].toString());
				}
				break;
				case 5:
				for(i=0;i<nor;i++)
				{
					System.out.println("The area="+r[i].getArea()+" and perimeter="+r[i].getPerimeter()+" of rectangle" +""+ (i+1));
					System.out.println(r[i].toString());
				}
				break;
				case 6:
				for(i=0;i<nos;i++)
				{
					System.out.println("The area="+sq[i].getArea()+" and perimeter="+sq[i].getPerimeter()+" of square" +""+ (i+1));
					System.out.println(sq[i].toString());
				}
				break;
				case 7:
				double on,off;
				for(i=0;i<noc;i++)
				{
					on=Math.ceil(c[i].getArea());
			        off=Math.ceil(sq[i].getArea());
					if(on==off)
					{
						System.out.println("The objects with same area are :");
						System.out.println("The area="+c[i].getArea()+"of circle" +" "+ (i+1));
					    System.out.println(c[i].toString());
						System.out.println("The area="+sq[i].getArea()+" of square" +" "+ (i+1));
					    System.out.println(sq[i].toString());
					}
				}
				break;
				default:
				System.out.println("invalid choice");
				break;
			}
		}
         while(ch<7);		
	}
}
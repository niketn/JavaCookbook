public class Rectangle extends shape
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

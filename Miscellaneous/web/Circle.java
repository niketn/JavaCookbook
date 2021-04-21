public class Circle extends shape
{
    // instance variables - replace the example below with your own
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

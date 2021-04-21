public class Square extends Rectangle
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

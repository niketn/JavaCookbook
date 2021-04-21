/*
 * Write a description of class shape here.
 * @author (NIKET NAIK)
 * @version ()
 */
public class shape
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

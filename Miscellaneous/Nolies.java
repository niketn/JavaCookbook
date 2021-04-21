import java.util.*;
class ExceptionBetween extends Exception
{
   ExceptionBetween(String str)
  {
     super(str);
  }
}
public class Nolies 
{
    public static void main(String args[])
    {
        double no;
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("enter a num:");
            no=s.nextDouble();
            if(0.7>no && 0.5<no)
                throw new ExceptionBetween("Number lies between exception parameter");
        }
        catch(ExceptionBetween ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
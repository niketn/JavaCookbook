import java.util.*;
import static java.lang.Math.*;
class operations
{
   int p,q;
   static int no=0;
   float ans;
    public operations()
	{
		p=1;
	    q=1;
	}
   public operations(int p,int q)
   {
      this.p=p;
	  this.q=q;
	  no++;
   }
   public void add(operations op)
   {
       int sum,den;
	   if(q==op.q)
	   {
		   sum=p+op.p;
		   ans=(float)sum/(float)q;
		   System.out.println("The addition of two rational no.is :"+sum+ "/"+q+"="+ans);
	   }
	   else
	   {
		   sum=p*op.q+op.p*q;
		   den=q*op.q;
		   ans=(float)sum/(float)den;
		   System.out.println("The addition of two no.is :"+sum+ "/"+den+"="+ans);
	   }
   }
   public void subract(operations op)
   {
       int sub,den;
	    if(q==op.q)
	   {
		    sub=p-op.p;
			ans=(float)sub/(float)q;
			System.out.println("The subraction of two rational no.is :" +sub+ "/" +q+ "="+ans);
	   }
	   else
	   {
		    sub=p*op.q-op.p*q;
		     den=q*op.q;
			 ans=(float)sub/(float)den;
			 System.out.println("The subraction of two no.is :" +sub+ "/" +den+"="+ans);
	   }
   }
   public void multiply(operations op)
   {
       int mul,den;
	   mul=p*op.p;
	   den=q*op.q;
	   ans=(float)mul/(float)den;
	   System.out.println("The multiplication of two no.is :" +mul+ "/" +den+"is "+ans);  
   }
   public void division(operations op)
   {
       int div,den;
	   div=p*op.q;den=q*op.p;
	   ans=(float)div/(float)den;
		System.out.println("The division of two no. :" +div+ "/" +den+ "is "+ans) ;
   }
   public void absolute(operations op)
   {
      int ab,ab1,a,a1;
	  ab=abs(p);
	  ab1=abs(q);
	  a=abs(op.p);
	  a1=abs(op.q);
	  ans=(float)ab/(float)ab1; 
	  System.out.println("The absolute of two no.is :" +ab+"/" +ab1+"="+ans);
	  ans=(float)a/(float)a1;
	  System.out.println("The absolute of two no.is :" +a+"/" +a1+"="+ans);
   }
   public void compare(operations op)
   {
       if(p/q<op.p/op.q)
	   System.out.println("The p/q value is less than p1/q1");
	   else if(p/q>op.p/op.q)
	   System.out.println("The p/q value is greater than p1/q1 ");
	   else
	   System.out.println("The  p/q and p1/q1 values are same" );
   }
   public void convert_to_float(operations op)
   {
      float f,f1,ff,f2;
	  f=(float)p;
	  f1=(float)q;
	  ff=(float)op.p;
	  f2=(float)op.q;
	  ans=f/f1;
	  System.out.println("The float value of two no.is :"+f+"/"+f1+"="+ans);
	  ans=ff/f2;
	  System.out.println("The float value of two no.is :"+ff+"/"+f2+"="+ans);
   }

}
class ObjectCountException extends Exception
{
	ObjectCountException(String str)
	{
		super(str);
	}
}
public class HandleOp
{
	static int x, y;
   public static void entry() 
   {
		Scanner s = new Scanner(System.in);
		int r, exy;
		System.out.println("enter rational number");
		System.out.println("enter x:");
		x = s.nextInt();
		exy = 1;
		while (exy == 1) 
		{
			System.out.println("enter y:");
			y = s.nextInt();
			try 
			{
				r = x / y;
				break;
			} 
			catch (Exception e) 
			{
				System.out.println("Divide by zero exception since y=0.\nenter y again");
				exy = 1;
			}
		}
	}
   public static void main(String args[])
   {
	   int ch;
	   char z;
	   Scanner s=new Scanner(System.in);
	   
	  do
	  {
		System.out.print("1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE\n5.FIND ABSOLUTE VALUE");
		System.out.print("\n6 TO FIND FLOATING POINT \n7.Compare\nENTER YOUR CHOICE: ");
		ch = s.nextInt();
		operations op1=new operations();
	    operations op2=new operations();
		switch(ch)	
		{
			case 1:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.add(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			case 2:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.subract(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			case 3:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.multiply(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			;
			break;
			case 4:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.division(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			case 5:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.absolute(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			case 6:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.convert_to_float(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			case 7:
			entry();
			try
			{
				op1=new operations(x,y);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			entry();
			try
			{
				op2=new operations(x,y);
				op1.compare(op2);
				if(operations.no==50)
		        throw new ObjectCountException("Object count excecceded");
			}
			catch(ObjectCountException ex)
	        {
		      System.out.println(ex.getMessage());
	        }
			
			break;
			default:
			System.out.println("Invalid option!!!");
			break;
		}
		
	       System.out.println("\ndo you wish to enter another rational number ? (Y/N):");
			z = s.next().charAt(0);
		} while (z == 'Y' || z == 'y'); 
   }
}
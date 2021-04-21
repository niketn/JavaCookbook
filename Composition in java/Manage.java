import java.util.*;
class Customer
{
   int ID;
   String name;
   char gender;
   public Customer(int ID,String name,char gender)
    {
	  this.ID=ID;
	  this.name=name;
	  this.gender=gender;
	}
    public int getID()
    {
	  return ID;
	}
    public String getName()
    {
	  return name;
	}
    public char getGender()
    {
	  return gender;
	}
     public String toString()
   {
	   return "("+name+"("+ID+")"+")";
   }	
}
class Account 
{
	int id;
	Customer customer;
	double balance;
	public Account()
	{
		id=0;
		balance=0.0;
	}
	public Account(int id,Customer customer,double balance)
	{
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}
	public Account(int id,Customer customer)
	{
		this.id=id;
		this.customer=customer;
	}
	public int getID()
	{
		return customer.getID();
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getCustomerName()
    {
		return customer.getName();
	}
	public Account deposit(double amount,Account v)
	{
		v.balance=v.balance+amount;
		return v;
	}
	public Account withdraw(double amount,Account v)
	{
		if(v.balance>=amount)
			v.balance=v.balance-amount;
		else
			System.out.println("Amount withdrawn exceeds the current balance!!");
		return v;
	}
	 public String toString()
   {
	   return customer.toString()  +"balance= $" +balance ;
   }
    public char getting()
	{
		return customer.getGender();
	}	
}
public class Manage
{
	public static void main(String args[])
	{
		Account A[];Customer c;
		Scanner s=new Scanner(System.in);
		int no,e,x,p=0;String n;char w;double u;
		System.out.print("Enter the no of entries to be made: ");
		no=s.nextInt();A=new Account[no];
		do
		{
			System.out.print("\n 1.ENTER \n 2.DEPOSIT  \n 3.WITHDRAW \n 4.DISPLAY \n 5.Total balance of Female customer Account \n 6.EXIT \n");
			System.out.print("Enter your choice: ");
			e=s.nextInt();
			switch(e)
			{
				case 1:
		        for(int i=0;i<no;i++)
		        {
			     System.out.print("\n Enter the customer name: ");
			     n=s.next();
			     System.out.print("\n Enter the customer id and gender(F/M): ");
			     e=s.nextInt();
			     w=s.next().charAt(0);
			     c=new Customer(e,n,w);
			     System.out.print("\n Enter the account id :");
			     x=s.nextInt();
			     System.out.print("\n Enter the balance :");
			     u=s.nextDouble();
			     A[i]=new Account(x,c,u);
		        }
				break;
		        case 2:
			    System.out.print("\n Enter the account id to which you want to deposit: ");
			    x=s.nextInt();
			    for(int i=0;i<no;i++)
		        {
				  if(x==A[i].id)
				  {
					p++;
					System.out.print("\n Enter the amount to be deposited: ");
				    u=s.nextDouble();
				    Account ac=new Account();
                    ac=A[i].deposit(u,A[i]);
				    System.out.println("The updated balance = "+ac.balance);
				  }
                }
                if(p==0)
                {
				   System.out.println("Account not found :");
			    }
                break;
				case 3:
				System.out.print("Enter the account id from which you want to withdraw: ");
			    x=s.nextInt();
                for(int i=0;i<no;i++)
		        {
				   if(x==A[i].id)
				  {
					 p++;
		            System.out.print("Enter the amount to be withdrawn: ");
			        u=s.nextDouble();
				    Account ac=new Account();
                    ac=A[i].withdraw(u,A[i]);
				    System.out.println("The updated balance = "+ac.balance);
				  }
                }
                if(p==0)
                {
				   System.out.println("Account not found :");
			    }
				break;
				case 4:
				for(int i=0;i<no;i++)
	            {
			      System.out.println(A[i].toString());
		        }
                break;
				case 5:
				double m=0;
				for(int i=0;i<no;i++)
		        {
				   if(A[i].getting()=='F')
				   {
					   System.out.println("Customer id:"+A[i].id  +A[i].toString()); 
					   m=m+A[i].getBalance();
				   }					   
				}
				System.out.println("Total balance of Female customer Account :" +m);
				break;
                case 6:
                break;
                default:
                System.out.println("Invalid option!!!");				
		    }		   
		}
		while(e!=6);
    }   
}
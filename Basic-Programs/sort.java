import java.util.Scanner;
public class sort
{
  public static void main(String args[])
  {
     char [] name= new char[10]; 
	 char temp;
	 int loc,lowest;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the name");
	 name= s.next().toCharArray();
	 for (int i = 0; i < name.length - 1; i++)
    {
        lowest = name[i];
        loc = i;
        for (int j = i + 1; j < name.length; j++)
        {
          if (lowest > name[j])
          {
             loc = j;
             lowest = name[j];
          }
        }
        temp =name[i];
        name[i] = name[loc];
        name[loc] =temp;
	}
	System.out.println("sorted Array elements are : ");
     for (int i=0;i<name.length;i++)
     System.out.printf("%c",name[i]);
  }
}
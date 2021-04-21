import java.util.Scanner;
public class spaces
{
  public static void main(String args[])
  {
    String sentnce;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter a sentence");
	sentnce=s.nextLine();
	System.out.println("sentence after operation");
	for(int i=0;i<sentnce.length();i++)
	{
		if(sentnce.charAt(i)==' ')
		{
			System.out.printf(",");
		}
		System.out.printf("%s",sentnce.charAt(i));
	}
	
  }
}
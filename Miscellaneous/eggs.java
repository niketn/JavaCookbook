import java.io.*;
import java.util.*;
public class eggs
{
   public static void main(String args[])throws Exception
   {
     File infile=new File("demo.txt");
	 BufferedReader in=new BufferedReader(new FileReader("demo.txt")); 
	 int co=0,t=0;
	 char ch;
	 String input;
	 Scanner s=new Scanner(infile);
	 PrintWriter p=new PrintWriter(infile);
	 p.print("Goa is a perfect destination for holidays ");
	 p.close();
	 while(s.hasNextLine())
	 {
		 input=s.nextLine();
		 for(int i=0;i<input.length();i++)
		 {
			ch=input.charAt(i);
			if(ch==' ')
			{
				continue;
			}
			co++;
		 }		
	 }
	 System.out.println("The no of letter in file is:" +co);
   }
}
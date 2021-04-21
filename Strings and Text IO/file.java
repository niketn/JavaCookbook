import java.io.*;
import java.util.*;
public class File
{
   public static void main(String args[])throws Exception
   {
     File infile=new File(args[0]+".txt");
	 BufferedReader in=new BufferedReader(new FileReader(args[0]+".txt")); 
	 int co=0,t;
	 Scanner s=new Scanner(infile);
	 System.out.println("The file name is: " +args[0]);
	 PrintWriter p=new PrintWriter(infile);
	 p.print("Goa is a perfect destination for holidays");
	 p.close();
	 System.out.println("The content of file is: 'Goa is a perfect destination for holidays' ");
	 while(s.hasNext())
	 {
		 if(s.next().length()>5)
		 {
			 co++;
		 }
	 }
	 System.out.println("The no of words whose length is >5 is:" +co);
   }
}
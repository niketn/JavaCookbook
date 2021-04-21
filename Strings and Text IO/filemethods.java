import java.io.*;
//import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;
class filemethods
{
   public static void main(String args[]) throws Exception
   {
      File infile;File newFile;
	  infile=new File("MCU.txt");
	  Scanner s=new Scanner(System.in);
	  String ch;
	  FileReader in=null; FileWriter out=null;
	  if(infile.exists())
	  {
		  System.out.println("\t File exists:");
		  System.out.println("\t File size before writing: "+infile.length() + "bytes");
		  if(infile.canWrite())
		  {
			System.out.println("\t File can be written"); 
		    System.out.print("\t Enter something :");
	        ch=s.nextLine();
	        PrintWriter p=new PrintWriter(infile);
	        p.print(ch);
	        p.close();
			System.out.println("\t File size after writing: "+infile.length() + "bytes");
		  }  
	 	  else
			System.out.println("\t File cannot be written");		  
		  if(infile.canRead())
		  {
			 System.out.printf("\t File can be read ");
			 Scanner w=new Scanner(infile);
			 while(w.hasNext())
			 {
				 System.out.print("\t" +w.next());
			 }
			 w.close();
		  }
		  else
			System.out.println("\t File cannot be read");
		System.out.printf("\n");
		  if(infile.isDirectory())
			System.out.println("\n File is a directory");
		  else
			System.out.println("\t File is not a directory");
		  
		  
		SimpleDateFormat S=new SimpleDateFormat("MM/dd/yyy  HH.mm.ss ");
		System.out.println("\t File last modified on :"+S.format(infile.lastModified()));
		System.out.println("\t The Absolute path: ");
		String te=infile.getAbsolutePath();
		System.out.println("\t"+te);
		System.out.println("\t The Canonical path: ");
		String t=infile.getCanonicalPath();
		System.out.println("\t"+t);
		System.out.print("\t The Parent name: ");
		String tp=infile.getParent();
		System.out.println("\t"+tp);
		System.out.print("\n\t Enter new File Name: ");
		String temp=s.next();
		newFile=new File(temp+".txt");
		if(infile.renameTo(newFile))
			System.out.println("\t Operation Completed ");
		else
			System.out.println("\t Operation Failed ");
		System.out.println("\t File name: "+newFile.getName());
		System.out.println("\t File size: "+newFile.length() + "bytes"); 
		if(newFile.delete())
			System.out.println("\t File successfully deleted ");
		else
			System.out.println("\t File cannot be deleted ");
	  }
	  else
		  System.out.println("\t File does not exists");
	  
	 
   }
}
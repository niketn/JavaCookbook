import java.io.*;
import java.util.Scanner;
import java.util.Date;
class FileMethodTest
{
	public static void main(String args[])
	{ 
	    int ch;
		File []path;
		try
       {
		   File dir=new File("JAVA Program");
		   if(dir.exists())
		   {
			   System.out.println("\n\tFolder Exist ");
		   }
		   else
		   {
			   System.out.println("\n\tFolder Not Exist ");
		   }
           Scanner s=new Scanner(System.in);
			while(true)
			{
				System.out.println("\n\t--------------------Press Key for Action------------------------");
				System.out.println("\t1->Write Data to File\t2->Read Data From File\t3->Absulute Path");
				System.out.println("\t4->Canonical Path\t5->Parent Directory\t6->Directory Path");
				System.out.println("\t7->Modification\t\t8->Size\t\t\t9->List of Files in Directory");
				System.out.print("\t10->Delete File\t\t11->Rename\t\t12->Exit ");
				ch=s.nextInt();
				switch(ch)
				{
					case 1:{
						System.out.print("\tEnter New File Name\n\tOR\n\tChoice From Below");
						String temp=listFile(dir,s);
						String temp1=dir.getPath();
						writeFile(temp,temp1);
						break;
					}
					case 2:{
						String temp=listFile(dir,s);
						String temp1=dir.getPath();
						readFile(temp,temp1);
						break;
					}
					case 3:{
						String temp=dir.getAbsolutePath();
						System.out.println("\n\t"+temp);
						break;
					}
					case 4:{
						String temp=dir.getCanonicalPath();
						System.out.println("\n\t"+temp);
						break;
					}
					case 5:{
						String temp=dir.getParent();
						System.out.println("\n\t"+temp);
						break;
					}
					case 6:{
						String temp=dir.getPath();
						System.out.println("\n\t"+temp);
						break;
					}
					case 7:{
						long temp=dir.lastModified();
						Date d=new Date(temp);
						System.out.println("\n\t"+d);
						break;
					}
					case 8:{
						String temp=listFile(dir,s);
						String temp1=dir.getPath();
						getSize(temp,temp1);
						break;
					}
					case 9:{
						String temp;
						path=dir.listFiles();
						for(File p:path)
						System.out.print("\n\t"+p);
						break;
					}
					case 10:{
						String temp=listFile(dir,s);
						String temp1=dir.getPath();
						deleteFile(temp,temp1);
						break;
					}
					case 11:{
						String temp=listFile(dir,s);
						String temp1=dir.getPath();
						renameFile(temp,temp1);
						break;
					}
					case 12:{
						System.exit(0);
					}
					default:System.out.println("\tInvalid Choice!!! ");
				}
			}
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
	static String listFile(File dir,Scanner s)
	{
		File []path=dir.listFiles();
		for(File p:path)
		System.out.print("\n\t"+p);
		System.out.print("\n\tEnter File Name: ");
		String s1=s.next();
		return s1;
	}
	static void readFile(String temp,String temp1)
	{
		try{
			File in=new File((temp1+"/"+temp));
			Scanner read=new Scanner(in);
			while(read.hasNext())
			{
				temp=read.nextLine();
				System.out.println("\t"+temp);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void writeFile(String temp,String temp1)
	{
		try{
			Scanner s=new Scanner(System.in);
			File in=new File((temp1+"/"+temp));
			PrintWriter pw=new PrintWriter(in);
			temp=s.nextLine();
			pw.println(temp);
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void getSize(String temp,String temp1)
	{
		try{
			File in=new File((temp1+"/"+temp));
			long len=in.length();
			System.out.println("\n\tSize\n\tByte: "+len);
			System.out.println("\tKilloByte (Kb): "+(len/1024));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void deleteFile(String temp,String temp1)
	{
		try{
			File in=new File((temp1+"/"+temp));
			
			if(in.delete())
			{
				System.out.println("\tOperation Completed ");
			}
			else{
				System.out.println("\tOperation Failed ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void renameFile(String temp,String temp1)
	{
		try{
			File in=new File((temp1+"/"+temp));
			Scanner s=new Scanner(System.in);
			System.out.print("\n\tEnter new File Name: ");
			temp=s.next();
			File newFile=new File((temp1+"/"+temp));
			if(in.renameTo(newFile))
			{
				System.out.println("\tOperation Completed ");
			}
			else{
				System.out.println("\tOperation Failed ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
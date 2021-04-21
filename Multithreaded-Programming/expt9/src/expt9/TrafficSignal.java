package expt9;
import java.applet.*;
import java.awt.*;

public class TrafficSignal extends Applet {

	public void init()
	{
		setSize(350,700);
	}

	public static int flag=1;
	public  void paint(Graphics g) 
	{   
		
		
		g.drawRect(100, 100, 200, 500);
		g.setColor(Color.gray);
		g.fillRect(100, 100, 200, 500);
		g.drawOval(150, 270, 100, 100);
		g.drawOval(150, 390, 100, 100);
		g.drawOval(150, 150, 100, 100);
		
		if(flag==1)
		{
		g.setColor(Color.green);
		g.fillOval(150, 150, 100, 100);
		flag=2;
		try 
		{
		Thread.sleep(2000);
		}
		catch(Exception e) {}
		
		}
		else if(flag==2)
		{
		g.setColor(Color.RED);
		g.fillOval(150, 270, 100, 100);
		flag=3;
		try 
		{
			Thread.sleep(2000);
		}
	    catch(Exception e) {}
		
		}
		else 
		{
	    g.setColor(Color.ORANGE);
		g.fillOval(150, 390, 100, 100);
		flag=1;
		try 
		{
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		
		}
		repaint();
		
	}
	
}

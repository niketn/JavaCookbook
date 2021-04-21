import java.awt.*;
import java.applet.*;
public class Graphs extends Applet
{ 
    int x[]={565,590,600,640,660,715,800,850};
	int y[]={120,75,240,215,305,105,60,259};
	
	int z[]={350,300,250,200,150,100,50};
	int n=x.length;
	public void paint(Graphics g)
	{
		g.drawString("No. of ", 10, 200);
		g.drawString("people", 10, 215);
		g.drawLine(50,50,50,350);
		g.drawLine(50,350,450,350);
		g.drawString("Products used", 200, 390);
		g.drawString("Demand", 500, 200);
		g.drawString("level", 500, 215);
		g.drawLine(550,50,550,350);
		g.drawLine(550,350,950,350);
		g.drawString("Years",700, 390);
		g.drawPolyline (x,y,n);
		g.setColor(Color.blue);
		g.fillRect(60,350-60,40,60);
		g.fillRect(110,350-120,40,120);
		g.fillRect(170,350-180,40,180);
		g.fillRect(220,350-240,40,240);
		g.fillRect(270,350-300,40,300);
		g.fillRect(320,350-115,40,115);
		g.fillRect(370,350-40,40,40);
		g.setColor(Color.black);
		for(int i=0;i<n;i++)
		{
			g.drawLine(50,z[i],450,z[i]);
			g.drawLine(550,z[i],950,z[i]);
		}	
	}
}
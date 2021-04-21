import java.awt.*;
import java.applet.*;
public class Script extends Applet
{
   public void paint(Graphics g)
   {
	   //first letter
      g.drawLine(50,100,50,160);
	  g.drawOval(60,115,20,20);
	  g.drawLine(64,115,125,115);
	  g.drawLine(125,100,125,160);
	  //second leter
	  g.drawOval(135,115,30,20);
	  g.drawLine(165,100,165,160);
	  g.drawArc(122,122,67,40,320,115);
	  //third letter
	  //g.drawLine(207,120,207,160);
	  g.drawArc(202,120,10,40,90,180);
	  g.drawLine(207,120,230,120);
	  g.drawLine(230,100,230,160);
	  //main line
	  g.drawLine(45,100,235,100);
	  //topi of first leter
	  g.drawArc(50,75,75,50,0,180);
	  //matra of k
	  g.drawLine(130,65,165,100);
	  g.drawOval(125,65,6,6);
   }
}
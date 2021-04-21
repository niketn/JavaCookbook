import java.awt.*;
import java.applet.*;
public class Clown extends Applet
{
   public void paint(Graphics g)
   {
     g.drawOval(50,50,120,150); 	 //head
	 //hat
	 g.drawLine(56,90,110,10);             
	 g.drawLine(110,10,164,90);
	 g.drawOval(79,67,30,40);              //lefteye
	 g.drawOval(115,67,30,40);             //righteye
	 g.fillOval(83,85,20,20);              //pupil(left)
	 g.fillOval(121,85,20,20);             //pupil(right)
	 g.setColor(Color.red);
	 g.fillOval(57,116,20,20);	           //leftcircle
	 g.setColor(Color.pink);
	 g.fillOval(95,120,30,30);             //nose
	 g.setColor(Color.red);
	 g.fillOval(140,116,20,20);             //rightcircle 
	 g.setColor(Color.black);
	 g.drawArc(70,105,80,60,180,180);	 //mouth (upperlip)
	 g.drawArc(74,126,70,55,179,179);      //mouth (lowerlip)
	 g.drawOval(35,90,15,30);              //left ear
	 g.drawOval(168,90,15,30);             //right ear
   }
}
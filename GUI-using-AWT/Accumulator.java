import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener.*;
public class Accumulator extends Frame implements ActionListener 
{
	TextField t1,t2;
	Label l1,l2;
	int num,sum=0;
public Accumulator()
{
	t1=new TextField(8);
	t1.setText("0");
	t2=new TextField(8);
	t2.setText("0");
	l1=new Label("Enter an Integer");
	l2=new Label(" The Accumulator sum is");
	add(l1);
	setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
	add(t1);
	add(l2);
	add(t2);
	setSize(300,300);
	setVisible(true);
	t1.addActionListener(this);
	t2.addActionListener(this);
}
public void actionPerformed (ActionEvent e)
{
	num=Integer.parseInt(t1.getText());
	sum+=num;
	t2.setText(sum+" ");
	/*if(e.getSource()==t1)
    {
		
	  float  c,f;
	  c=Float.parseFloat(t1.getText());
	  f=(float)((1.8)*c+32);
	  t2.setText(String.format("%.2f", f));
	}
	if(e.getSource()==t2)
	{
		float  c,f;
		f=Float.parseFloat(t2.getText());
		c=(float)((f-32)/1.8);
		t1.setText(String.format("%.2f", c));
	}*/
	
}
public static void main(String args[])
{
	new Accumulator();
}

}

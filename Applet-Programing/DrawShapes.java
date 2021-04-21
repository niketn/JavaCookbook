import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DrawShapes extends JFrame implements ActionListener {

	int fillflag=0;
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4,l5;
	JButton draw,fill;
	List l=new List();
	List c=new List();
	public DrawShapes()
	{
		t1=new JTextField(8); t1.setText("0");
		t2=new JTextField(8); t2.setText("0");

		l1=new JLabel("Side 1 ");
		l2=new JLabel("Side 2 ");
		fill=new JButton("FILL/UNFILL");
		draw=new JButton("DRAW");
		

		l.add("Circle");
		l.add("Square");
		l.add("Rectangle");
		l.add("Hexagon");
		l.add("Triangle");

		
		c.add("Cyan");
		c.add("Blue");
		c.add("Yellow");
		c.add("Black");
		c.add("Red");
		c.add("Green");

		setSize(1375,770);
		setVisible(true);
		setLayout(new FlowLayout());

		add(l1); add(t1);
		add(l2); add(t2);
		add(draw);
		add(fill);
		add(l);
		add(c);

		fill.addActionListener(this);
		draw.addActionListener(this);
	}

	public void paint(Graphics g)
	{
		super.paint(g);


		switch(c.getSelectedItem())
		{
			case "Red":
				g.setColor(Color.red);
				break;
			case "Blue":
				g.setColor(Color.blue);
				break;
			case "Green":
				g.setColor(Color.green);
				break;
			case "Yellow":
				g.setColor(Color.yellow);
				break;
			case "Cyan":
				g.setColor(Color.cyan);
				break;
			default:
				g.setColor(Color.black);
		}


		switch(l.getSelectedItem())
		{
			case "Circle":
				int r=Integer.parseInt(t1.getText());
				g.drawOval(500, 200, r, r);
				if(fillflag==1)
					g.fillOval(500, 200, r, r);

				break;

			case "Square":
				int s=Integer.parseInt(t1.getText());
				g.drawRect(500, 200, s, s);
				if(fillflag==1)
					g.fillRect(500, 200, s, s);

				break;

			case "Rectangle":
				int l=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				g.drawRect(500, 200, l, b);
				if(fillflag==1)
					g.fillRect(500, 200, l, b);

				break;

			case "Hexagon":
				int x[]= {500,
						  500+ Integer.parseInt(t1.getText()),
						  500+ Integer.parseInt(t1.getText())+ (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())/2),
						  500+ Integer.parseInt(t1.getText()),
						  500,
						  500- (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())/2)};

				int y[]= {200,
					   	  200,
					   	  200+ (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())/2),
					   	  200+ (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())),
					   	  200+ (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())),
					   	  200+ (int)Math.sqrt(3)*(Integer.parseInt(t1.getText())/2)};

				g.drawPolygon(x,y,6);
				if(fillflag==1)
					g.fillPolygon(x,y,6);

				break;

			case "Triangle":
				int p[]= {500,
						  500+ Integer.parseInt(t1.getText())/2,
						  500- Integer.parseInt(t1.getText())/2};

				int q[]= {200,
						  200+ (int)Math.sqrt(3)*Integer.parseInt(t1.getText())/2,
						  200+ (int)Math.sqrt(3)*Integer.parseInt(t1.getText())/2};

				g.drawPolygon(p,q,3);
				if(fillflag==1)
					g.fillPolygon(p,q,3);

				break;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==draw)
			repaint();
		if(e.getSource()==fill)
		{
			if(fillflag==0)
			{
				fillflag=1;
				repaint();
			}
			else
			{
				fillflag=0;
				repaint();
			}
		}

	}

}

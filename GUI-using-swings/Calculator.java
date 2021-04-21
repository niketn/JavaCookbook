package vidhya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame implements ActionListener {

	private JPanel contentPane;
	String[][] sym = { { "1", "2", "3", "c" }, { "4", "5", "6", "+" }, { "7", "8", "9", "-" }, { "0", "%", "/", "*" } };
	float num1, num2;
	String op ="";
	private JLabel out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		out = new JLabel("0");
		out.setFont(new Font("Tahoma", Font.PLAIN, 24));
		out.setVerticalAlignment(SwingConstants.BOTTOM);
		out.setHorizontalAlignment(SwingConstants.TRAILING);
		out.setBounds(10, 10, 230, 70);
		contentPane.add(out);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				JButton tmp = new JButton(sym[i][j]);
				tmp.setFont(new Font("Tahoma", Font.PLAIN, 16));
				tmp.setBounds(10 + (60 * j), 90 + (i * 60), 50, 50);
				tmp.addActionListener(this);
				contentPane.add(tmp);
			}
		}

		JButton b = new JButton("=");
		b.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b.setBounds(10, 326, 230, 59);
		b.addActionListener(this);
		contentPane.add(b);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String tmp = arg0.getActionCommand();
		System.out.println(tmp);

		Float t = 0.0f;
		float ans = 0;
		try {
			t = Float.parseFloat(tmp);
			if (op.equals("")) {
				
				num1=num1*10;
				num1+=t;
				out.setText(String.valueOf(num1));
			} else {
				num2=num2*10;
				num2+=t;
				out.setText(String.valueOf(num2));
			}
		} catch (NumberFormatException e) {
			if (tmp.equalsIgnoreCase("=")) {
				System.out.println(tmp);
				
				if(op.equals("+")){
					ans = num1 + num2;
				}
				else if(op.equals("-")){
					ans=num1 - num2;
				}
				else if(op.equals("*")){
					ans=num1 * num2;
				}
				else if(op.equals("/")){
					ans=num1 / num2;
				}
				else if(op.equals("%")){
					ans=num1 % num2;
				}
				out.setText(String.valueOf(ans));
				num1 = ans;
				op = "";
			}
			else if(tmp.equalsIgnoreCase("c")){
				num1=num2=0;
				op="";
				out.setText("");
			}
			else{
				op = tmp;
				
			}
		}
		
	}

}

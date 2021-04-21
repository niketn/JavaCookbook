//package vidhya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;
	private JPasswordField numF;
	private JTextField user;
	private int num = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		setResizable(false);
		setTitle("Guess Number");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Number Is");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 203, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Guess");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 62, 203, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Generate\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = new Random().nextInt(99);
				
				numF.setText(String.valueOf(num));
				System.out.println(num);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(480, 11, 144, 40);
		contentPane.add(btnNewButton);
		
		JLabel hint = new JLabel();
		hint.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hint.setBounds(478, 60, 146, 40);
		contentPane.add(hint);
		
		numF = new JPasswordField();
		numF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numF.setEditable(false);
		numF.setBounds(223, 11, 247, 40);
		contentPane.add(numF);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		user.setBounds(223, 62, 245, 40);
		contentPane.add(user);
		user.setColumns(10);
		
		user.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					int a = Integer.parseInt(user.getText());
					if(a==num){
						hint.setText("You Got it");
						
					}else if(a > num){
						hint.setText("Try Lower");
					}else {
						hint.setText("Try Higher");
					}
					
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}

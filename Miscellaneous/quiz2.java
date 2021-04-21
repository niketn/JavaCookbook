import javax.swing.*;
import java.awt.event.*;
public class quiz2 extends JFrame
{
    private JButton anwser1;
    private JButton anwser2;
    private JButton anwser3;
    private JButton anwser4;
    private JPanel panel;
    private JLabel messageLabel;
    private JLabel messageLabel2;
    private final int WINDOW_WIDTH  = 300;
    private final int WINDOW_HEIGHT = 120;
    int c = 0;
    public quiz2()
    {
        setTitle("Event Object Demonstration");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageLabel = new JLabel("What program language is this written in");
        anwser1 = new JButton("C++");
        anwser2 = new JButton("Java");
        anwser3 = new JButton("Unix");
        anwser4 = new JButton("Pearl");

        anwser1.addActionListener(new ButtonListener());

        anwser2.addActionListener(new ButtonListener());

        anwser3.addActionListener(new ButtonListener());

        anwser4.addActionListener(new ButtonListener());
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(anwser1);
        panel.add(anwser2);
        panel.add(anwser3);
        panel.add(anwser4);

        add(panel);
        setVisible(true);
        setTitle("Event Object Demonstration");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageLabel = new JLabel("What is 2 + 3");
            anwser1 = new JButton("5");
            anwser2 = new JButton("19");
            anwser3 = new JButton("1");
            anwser4 = new JButton("6");
            anwser1.addActionListener(new ButtonListener());

            anwser2.addActionListener(new ButtonListener());

            anwser3.addActionListener(new ButtonListener());

            anwser4.addActionListener(new ButtonListener());

            panel = new JPanel();

            panel.add(messageLabel);

            panel.add(anwser1);

            panel.add(anwser2);
            panel.add(anwser3);
            panel.add(anwser4);
            add(panel);
            setVisible(true);
        }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("C++"))
        {
            JOptionPane.showMessageDialog(null, "Wrong");
        }
        else if(actionCommand.equals("Java"))
        {
            JOptionPane.showMessageDialog(null, "Correct");
            c++;
        }
        else if(actionCommand.equals("Unix"))
        {
            JOptionPane.showMessageDialog(null, "Wrong");
        }
        else if(actionCommand.equals("Pearl"))
        {
            JOptionPane.showMessageDialog(null, "Wrong");
        }
         JOptionPane.showMessageDialog(null, c + "Correct out of 1" + 100 * c/1 + "%" );
         JOptionPane.showMessageDialog(null, 100* c/1 + "%");
        }
   }

    public static void main(String[] args)
    {

        quiz2 eow = new quiz2();
    }
}
import javax.swing.*;
import java.awt.event.*;

public class Question5
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Simple Interest");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 250);

        SimplePanel p = new SimplePanel();
        f.add(p);

        f.setVisible(true);
    }
}

class SimplePanel extends JPanel
{
    private final JTextField t1, t2, t3, t4;
    private final JLabel l1, l2, l3, l4;

    public SimplePanel()
    {
        l1 = new JLabel("Principal");
        l2 = new JLabel("Rate");
        l3 = new JLabel("Time");
        l4 = new JLabel("Simple Interest");

        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(8);
        t4 = new JTextField(8);

        MyEvent e = new MyEvent();

        addMouseListener(e);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);
    }

    private class MyEvent extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());

            double si = (p * r * t) / 100;

            t4.setText(String.valueOf(si));
        }
    }
}
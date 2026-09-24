import javax.swing.*;
import java.awt.event.*;

public class Question6
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Largest Number");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 250);

        SimplePanel p = new SimplePanel();
        f.add(p);

        f.setVisible(true);
    }
}

class SimplePanel extends JPanel
{
    private final JTextField t1, t2, t3, t4;
    private final JButton b;
    private final JCheckBox cb;
    private final JLabel l1, l2, l3, l4;

    public SimplePanel()
    {
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Number 3");
        l4 = new JLabel("Largest");

        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(8);
        t4 = new JTextField(8);

        b = new JButton("Find Largest");
        cb = new JCheckBox("Check to Display");

        MyEvent e = new MyEvent();

        b.addActionListener(e);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(cb);
        add(b);

        add(l4);
        add(t4);
    }

    private class MyEvent implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (cb.isSelected())
            {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                int z = Integer.parseInt(t3.getText());

                int largest = x;

                if (y > largest)
                {
                    largest = y;
                }

                if (z > largest)
                {
                    largest = z;
                }

                t4.setText(String.valueOf(largest));
            }
        }
    }
}
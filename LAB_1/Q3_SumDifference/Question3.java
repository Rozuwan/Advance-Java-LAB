import javax.swing.*;
import java.awt.event.*;

public class Question3
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Sum and Difference");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);

        SimplePanel p = new SimplePanel();
        f.add(p);

        f.setVisible(true);
    }
}

class SimplePanel extends JPanel
{
    private final JTextField t1, t2, t3;
    private final JButton add, subtract;
    private final JLabel l1, l2, l3;

    public SimplePanel()
    {
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");

        t1 = new JTextField(8);
        t2 = new JTextField(8);
        t3 = new JTextField(8);

        add = new JButton("Add");
        subtract = new JButton("Subtract");

        MyEvent e = new MyEvent();

        add.addActionListener(e);
        subtract.addActionListener(e);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(add);
        add(subtract);

        add(l3);
        add(t3);
    }

    private class MyEvent implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());

            if (e.getSource() == add)
            {
                t3.setText(String.valueOf(x + y));
            }
            else if (e.getSource() == subtract)
            {
                t3.setText(String.valueOf(x - y));
            }
        }
    }
}
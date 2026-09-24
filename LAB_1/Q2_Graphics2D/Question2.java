import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Question2
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("2D Shapes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 400);

        SimplePanel p = new SimplePanel();
        f.add(p);

        f.setVisible(true);
    }
}

class SimplePanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Rectangle
        Rectangle2D r = new Rectangle2D.Double(50, 50, 120, 80);
        g2d.draw(r);

        // Ellipse
        Ellipse2D e = new Ellipse2D.Double(220, 50, 120, 80);
        g2d.draw(e);

        // Round Rectangle
        RoundRectangle2D rr =
            new RoundRectangle2D.Double(50, 180, 120, 80, 20, 20);
        g2d.draw(rr);

        // Arc
        Arc2D a =
            new Arc2D.Double(220, 180, 120, 80, 0, 180, Arc2D.OPEN);
        g2d.draw(a);
    }
}
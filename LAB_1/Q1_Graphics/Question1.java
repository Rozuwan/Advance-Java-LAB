import javax.swing.*;
import java.awt.*;

public class Question1
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Graphics Shapes");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 500);

        GraphicsPanel p = new GraphicsPanel();
        f.add(p);

        f.setVisible(true);
    }
}

class GraphicsPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // Line
        g.drawLine(50, 50, 200, 50);

        // Rectangle
        g.drawRect(50, 100, 150, 80);

        // Oval
        g.drawOval(250, 100, 150, 80);

        // Circle
        g.drawOval(50, 220, 100, 100);

        // Arc
        g.drawArc(250, 220, 150, 100, 0, 180);

        // Polygon / Triangle
        int x[] = {450, 400, 500};
        int y[] = {100, 200, 200};

        g.drawPolygon(x, y, 3);
    }
}
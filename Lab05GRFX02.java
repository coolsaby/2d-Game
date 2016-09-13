// Lab05GRFX02.java
// This is the starting version of the Lab05GRFX02 assignment.
// Converted from Applet to JPanel, 2016 08 05 Schenke

import javax.swing.*;
import java.awt.*;

public class Lab05GRFX02 extends JPanel
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("AP CompSci Lab05GRFX02");
        Lab05GRFX02 lab = new Lab05GRFX02();
        int w=1000; int h = 650;  // dimension of panel
        frame.setSize(w+20,h+40);
        frame.add(lab);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 10;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        

    }
}


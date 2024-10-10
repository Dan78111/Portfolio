import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Polygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polygon extends Container
{
    // instance variables - replace the example below with your own
    private int numSides;
    private int startX;
    private int startY;
    private int size;
    private double startAngle;
    private Color myColor;
    /**
     * Constructor for objects of class Polygon
     */
    public Polygon(int x, int y, int size, int n, double startAngle,Color c)
    {
        // initialise instance variables
        setBounds (0, 0, 1200, 700);
        numSides = n;
        startX = x;
        startY = y;
        this.size = size;
        this.startAngle = startAngle;
        myColor = c;
        makePolygon ();
    }

    private void makePolygon ()
    {
        int newX = startX;
        int newY = startY;
        double deltaAngle = (Math.PI * (numSides - 2.0)) / numSides;
        double newAngle = deltaAngle + startAngle;
        int counter = 0;
        while (counter < numSides)
        {
            int deltaX = (int) (Math.cos (newAngle) * size);
            int deltaY = (int) (Math.sin (newAngle) * size);
            Line line = new Line (newX, newY, newX + deltaX, newY - deltaY);
            line.setBackground(myColor);
            this.add (line, 0);
            newX = newX + deltaX;
            newY = newY - deltaY;
            counter++;
            int ratio = counter%2==0?0:1;
            newAngle = (deltaAngle * (counter + 1)) + Math.PI * ratio + startAngle;
        }
    }
   
}

import javax.swing.*;
import java.awt.*;

/** Triangle Supplier Class 
 * Author: Sharon DeReamer
 * Date: November, 2008
 */
public class Triangle extends JComponent  {

    private int [] theXs;
    private int [] theYs;
      
    /** post:   bounds are set to x = x, y = y, width = w and height = h
     *          and  color is set to black
     *          and  three corners of the triangle are set to
     *          (x, y), (x + w, y + h), and (x + w/2, y)
     */
    public Triangle (int x, int y, int w, int h)
    {
        super ();
        setBounds (x, y, w, h);
        setBackground(Color.black);
        
        theXs = new int [3];
        theXs[0] = 0;
        theXs[1] =  w;
        theXs[2] = w / 2;
        
        theYs = new int [3]; 
        theYs[0] = h;
        theYs[1] =  h;
        theYs[2] = 0;  
    }

    /** post:   bounds are set to x = the lowest X passed in and y = the lowest Y passed in
     *          Also w = the highest x - the lowest x passed in
     *          and h = the highest y passed in - the lowest y passed in
     *          The color is defaulted to black
     *          And the arrays are filled with the xs and ys respectively
     */
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)  {
        super();
        int highestX = highest (x1, x2, x3);
        int highestY = highest (y1, y2, y3);
        
        int lowestX = lowest (x1, x2, x3);
        int lowestY = lowest (y1, y2, y3);
        
        setBounds(lowestX, lowestY, highestX - lowestX, highestY - lowestY);
        setBackground(Color.black);
        
        theXs = new int [3]; 
        theXs[0] = x1 - lowestX;
        theXs[1] =  x2 - lowestX;
        theXs[2] = x3 - lowestX;
        
        theYs = new int [3]; 
        theYs[0] = y1 - lowestY;
        theYs[1] =  y2 - lowestY;
        theYs[2] = y3 - lowestY;
    }
    
    /**
     * post:  Takes three ints and returns the lowest of the three
     */
     private int lowest (int i1, int i2, int i3)
     {
        int lowest = i1;
        if (lowest > i2 || lowest > i3)
        {
            lowest = i2;
            if (lowest > i3)
            {
                lowest = i3;
            }
        }
        return lowest;
    }
     
    /**
     * post:  Takes three ints and returns the highest of the three
     */
     private int highest (int i1, int i2, int i3)
     {
        int highest = i1;
        if (highest < i2 || highest < i3)
        {
            highest = i2;
            if (highest < i3)
            {
                highest = i3;
            }
        }
        return highest;
    }

    /** post:   this method draws a filled Triangle
     *          The corners of the triangle are determined the the
     *          array that holds the x values and the array that
     *          holds the y values of the three points.
     */
    public void paint(Graphics g)  {
        g.setColor( getBackground() );
        g.fillPolygon(theXs, theYs, 3);
   }

}
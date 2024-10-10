import javax.swing.*;
import java.awt.*;
public class Line extends JComponent  {
    private boolean isMajorDiagonal;

	public Line(int x1, int y1, int x2, int y2)  {
        super();
        setBounds(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2)+1, Math.abs(y1-y2)+1);
        setBackground(Color.black);
        isMajorDiagonal = (x1==Math.min(x1,x2) && y1==Math.min(y1,y2)) || (x2==Math.min(x1,x2) && y2==Math.min(y1,y2));         
	}

    /**   postconditon
            this method draws a line segment from point (getX(),getY()) to point 
            (x2, y2) in the background coordinate system and with  color from getBackground() */
    public void paint(Graphics g)  {
        g.setColor( getBackground() );
        if (isMajorDiagonal)
            g.drawLine(0, 0, getWidth()-1, getHeight()-1);
        else
            g.drawLine(0, getHeight()-1, getWidth()-1, 0);
   }

}
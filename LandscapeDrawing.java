// Daniel Castillo SLCC Comp Sci 1400
import javax.swing.*;
import java.awt.Color;

public class LandscapeDrawing
{
    public static void createSky(JFrame win){
        Color brown = new Color(255, 87, 51);
        Rectangle frame = new Rectangle(100,100,650,600);
        win.add(frame,0);
    
        Rectangle sky = new Rectangle(25,25,600,550);
        sky.setBackground(Color.BLUE);
        frame.add(sky,0);
        
        Line left = new Line(200,100,325,25);
        win.add(left,0);
        
        Line right = new Line(650,100,325,25);
        win.add(right,0);
        
        Triangle mountain = new Triangle(-100,850,70,50,800,600);
        sky.add(mountain,0);
        mountain.setBackground(Color.DARK_GRAY);

        Rectangle trunk = new Rectangle(435,450,25,100);
        trunk.setBackground(brown);
        frame.add(trunk,0);
        
        Triangle tree = new Triangle(365,475,525,475,440,300);
        frame.add(tree,0);
        tree.setBackground(Color.GREEN);
        
        Oval ov = new Oval(0, 450, 400,80);
        sky.add(ov,0);
        ov.setBackground(Color.LIGHT_GRAY);
        
        Oval sun = new Oval(500,25,150,150);
        sun.setBackground(Color.YELLOW);
        sky.add(sun,0);
        


    }

    public static void main(String[]args){
        JFrame win = new JFrame("Drawing");
        win.setBounds(30,30,600,550);
        win.setLayout(null);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        win.setVisible(true);
        createSky(win);
        

        
    }
}

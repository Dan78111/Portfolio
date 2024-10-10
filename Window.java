// Daniel Castillo SLCC Comp Sci 1400 2-2 Ghost
import javax.swing.*;
import java.awt.Color;

public class Window
{
    public static void createBackground(JFrame win){
        
        Rectangle background = new Rectangle(0,0,650,650);
        background.setBackground(Color.BLUE);
        win.add(background,0);
        Ghost jasper = new Ghost(background,30,30);
        Ghost casper = new Ghost(background,500,150);
        Ghost hugo = new Ghost(background,200,30);
        Ghost jasmine = new Ghost(background,400,400);
        Ghost anthony = new Ghost(background, 100,500);
        Ghost brighton = new Ghost(background,280,350);
        
        hugo.changeColor(Color.GREEN);
        casper.changeColor(Color.YELLOW);
        jasper.changeColor(Color.RED);
        jasmine.changeColor(Color.PINK);
        anthony.changeColor(Color.MAGENTA);
        brighton.changeColor(Color.ORANGE);
        
    
    }
    
    public static void main(String[]args){
        JFrame win = new JFrame("Ghosts");
        win.setBounds(30,30,600,600);
        win.setLayout(null);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        createBackground(win);
        win.setVisible(true);

    }
}

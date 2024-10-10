import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

/** 
 * Natalie Watts
 * Murray High School
 * Edited Version: October 3, 2014
 */
public abstract class ButtonWindow  
{  
    //---- Methods Needing Implementation in Subclasses ----------- 
    //     public abstract void resetAction();
    //     public abstract void inputAction();
    public abstract void act();
    
    protected class ButtonWindowFrame extends JFrame implements ActionListener
    {
        //------- Instance Variables ------------------------------------
        private JButton actButton;
        private Container pane;
        private JButton resetButton, inputButton;
        
        //------- Instance Variables used for animation -----------------
        private JButton animateButton;
        private boolean isAnimating = false;
        protected int fps = 10;
        private Timer t = new Timer();
        
        //-------- Window Methods ---------------------------------------
        public ButtonWindowFrame(String s)
        {
            super(s);
            setBounds(20, 5, 900, 550);  
            pane = getContentPane();
            pane.setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        public void setWinLocation(int x, int y)
        {
            this.setLocation(x,y);
        }

        public void setWinSize(int w, int h)
        {
            this.setSize(w,h);
        }

        //-------- Regular Button Methods -------------------------------
        public void addActButton(int x, int y, int w, int h){
            actButton = new JButton("Act");
            actButton.setBounds(x, y, w, h);
            actButton.addActionListener(this);
            pane.add(actButton,0);
            pane.repaint();
        }

        public void setActButtonLocation(int x, int y)
        {
            resetButton.setLocation(x,y);
        }

        public void setActButtonSize(int w, int h)
        {
            resetButton.setSize(w,h);
        }

        public void setActButtonText(String s)
        {
            resetButton.setText(s);
        }

        //---------- Method called when a button is clicked -----------
        public void actionPerformed(ActionEvent e)
        {
            //             if (e.getSource() == actButton)
            //                    act(); 
            //             else if (e.getSource() == inputButton)
            //                 inputAction();
            //             else if (e.getSource() == resetButton)
            //                 resetAction();
            //             else if (e.getSource() == animateButton)
                             animate();
        }

        //-------- Additional Regular Buttons and Methods --------------
        public void addResetButton(int x,int y,int w,int h)
        {
            resetButton = new JButton("Reset");
            resetButton.setBounds(x, y, w, h );
            resetButton.addActionListener(this);
            pane.add(resetButton, 0);
            pane.repaint();
        }

        public void addInputButton(int x,int y,int w,int h)
        {
            inputButton = new JButton("Guess");
            inputButton.setBounds(x, y, w, h);
            inputButton.addActionListener(this);
            pane.add(inputButton, 0);
            pane.repaint();
        }
        
        public void setResetButtonLocation(int x, int y)
        {
            resetButton.setLocation(x,y);
        }

        public void setResetButtonSize(int w, int h)
        {
            resetButton.setSize(w,h);
        }

        public void setResetButtonText(String s)
        {
            resetButton.setText(s);
        }

        public void setInputButtonLocation(int x, int y)
        {
            inputButton.setLocation(x,y);
        }

        public void setInputButtonSize(int w, int h)
        {
            inputButton.setSize(w,h);
        }

        public void setInputButtonText(String s)
        {
            inputButton.setText(s);
        }
        
        //-------- Animation Button -------------------------------------
        public void addAnimateButton(int x, int y, int w, int h){
            animateButton = new JButton("Start");
            animateButton.setBounds(x, y, w, h);
            animateButton.addActionListener(this);
            pane.add(animateButton,0);
            pane.repaint();
        }

        public void setAnimateButtonLocation(int x, int y)
        {
            resetButton.setLocation(x,y);
        }

        public void setAnimateButtonSize(int w, int h)
        {
            resetButton.setSize(w,h);
        }

        public void setAnimateButtonText(String s)
        {
            resetButton.setText(s);
        }

        //-------- Animation Methods ------------------------------------
        public void animate(){
            if (!isAnimating){
                isAnimating = true;
                t.schedule(new MyTimerTask(), 0, 1000/fps);
                animateButton.setText("Stop");
            }
            else{
                isAnimating = false;
                t.cancel();
                t = new Timer();
                animateButton.setText("Start");
            }
        }

        public void stop(){
            t.cancel();
            t = new Timer();
        }

        public class MyTimerTask extends TimerTask
        {
            @Override
            public void run() {
                act();
            }
        }
        public void setFps(int fps)
        {
            this.fps = fps;
        }

        public int getFps(){
            return fps;
        }
    }
}
import java.awt.Color;
public class Ghost
{
    private Rectangle box;
    private Oval head;
    private Rectangle body;
    private Oval leftEye;
    private Oval rightEye;
     
    public void changeColor(Color c){
        head.setBackground(c);
        body.setBackground(c);

    }
    public Ghost(Rectangle sky, int x, int y){
        box = new Rectangle(x,y,100,200);
        sky.add(box,0);
        
        head = new Oval(-50,0,200,600);
        head.setBackground(Color.WHITE);
        box.add(head,0);
        
        body = new Rectangle(100,100,100,200);
        body.setBackground(Color.WHITE);
        box.add(body,0);
        
        leftEye = new Oval(60,60,30,50);
        head.add(leftEye,0);
        
        rightEye = new Oval(100,60,30,50);
        head.add(rightEye,0);
        

        
    }
    public Ghost(Rectangle sky, int x, int y,Color c){
        box = new Rectangle(x,y,100,200);
        sky.add(box,0);
        
        head = new Oval(-50,0,200,600);
        head.setBackground(c);
        box.add(head,0);
        
        body = new Rectangle(100,100,100,200);
        body.setBackground(c);
        box.add(body,0);
        
        leftEye = new Oval(60,60,30,50);
        head.add(leftEye,0);
        
        rightEye = new Oval(100,60,30,50);
        head.add(rightEye,0);
        

        
    }
}


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JPanel;


class ImagePanel extends JPanel {
    private Image img;
    public ImagePanel(Image img)
    {
      this.img = img;
      Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
      setSize(size);
    }

    public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
    }
}
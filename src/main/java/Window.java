import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
public class Window extends JPanel  {
    final int HEIGHT = 1000;
    final int WIDTH = 1500;
    JFrame f = new JFrame();

    public Window(){

    }
    public void addComponent(Component component) {
        f.add(component);

    }
    public void drawWindow()
    {
        f.setSize(WIDTH, HEIGHT);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g){

    }

}
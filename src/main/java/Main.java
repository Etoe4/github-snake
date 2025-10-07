import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Main extends JPanel {

    public static void main(String[] args) {
        Window window = new Window();
        Field field = new Field();
        window.addComponent(field);
        window.drawWindow();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        System.out.println("sad");
    }
}

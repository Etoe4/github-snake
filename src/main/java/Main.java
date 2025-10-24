import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
public class Main extends JPanel {
    public static void main(String[] args) {
        Window window = new Window();

        int fieldRows = 6;
        int fieldColumns = 6;
        Field field = new Field(fieldColumns, fieldRows);
        window.addComponent(field);
        window.drawWindow();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("sad");
    }
}
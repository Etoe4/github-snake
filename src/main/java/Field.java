import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
// ИДЕЯ ЗМЕЙКА СЫН КЛАССА ВСЕГО ПОЛЯ, ЧТОБЫ СОХРАНИТЬ КОРДИНАТЫ
public class Field extends JPanel {

    final int SIZE = 100;
    final Color COLOR = Color.green;
    int x_squires = 6;
    int y_squires = 6;
    final int DISTANCE_BETWEEN_X = 130;
    Field(){
    }

    public void drawSquire(Graphics2D g2d, int position_x, int position_y){
        g2d.setColor(COLOR);
        Rectangle2D squire = new Rectangle2D.Double(position_x, position_y, SIZE, SIZE);
        g2d.fill(squire);
    }

    @Override
    protected void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
    Rectangle2D squire = new Rectangle2D.Double(0, 0, 111, 111);
        g2d.fill(squire);
    }
}



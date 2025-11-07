import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Snake extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Layout layout = new Layout();
        draw(g2d, layout, 2 ,2);
    }
    public void draw(Graphics2D g2d, Layout layout, int row, int col){
        int x = layout.GetCellX(col);
        int y = layout.GetCellY(row);
        int size = layout.getCellsSize();
        g2d.setColor(Color.red);
        Rectangle2D squire = new Rectangle2D.Double(x, y, size, size);
        g2d.fill(squire);
    }
}

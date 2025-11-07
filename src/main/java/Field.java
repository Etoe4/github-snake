import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Field extends JPanel {
    int fieldSizeX;
    int fieldSizeY;

    Field(int fieldSizeX, int fieldSizeY){
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Layout layout = new Layout();
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                draw(g2d, layout, i, j);
            }
        }
    }
    public void draw(Graphics2D g2d, Layout layout, int row, int col){
        int x = layout.GetCellX(col);
        int y = layout.GetCellY(row);
        int size = layout.getCellsSize();
        g2d.setColor(Color.green);
        Rectangle2D squire = new Rectangle2D.Double(x, y, size, size);
        g2d.fill(squire);
    }
}
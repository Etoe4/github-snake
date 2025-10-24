public class Layout {
    final int margin = 10;
    final int cellSize = 100;
    public int getCellsSize(){
        return cellSize;
    }
    public int GetCellX(int c) {
        return margin + c * (margin + cellSize);
    }
    public int GetCellY(int r) {
        return margin + r *(margin + cellSize);
    }
}
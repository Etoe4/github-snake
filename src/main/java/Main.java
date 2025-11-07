public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        int fieldRows = 6;
        int fieldColumns = 6;
        Field field = new Field(fieldColumns, fieldRows);
        Snake snake = new Snake();
        window.addComponent(field);
        window.addComponent(snake);
        window.drawWindow();
    }
}
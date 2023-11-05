package CodeWars;

public class Canvas {
    private final int width;
    private final int height;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        String xLine = "-".repeat(this.width + 2) + "\n";
        String yLines = ("|" + (" ").repeat(this.width) + "|\n").repeat(this.height);
        return xLine + yLines + xLine;
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas(8, 6);
        System.out.println(canvas.drawCanvas());
    }
}
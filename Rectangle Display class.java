import java.util.Random;

public class RectangleDisplay {
    private int width;
    private int height;

    public RectangleDisplay(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isSilly() {
        return width == height;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public static RectangleDisplay randomRec() {
        Random rand = new Random();
        int width = rand.nextInt(100) + 1; // random width between 1 and 100
        int height = rand.nextInt(100) + 1; // random height between 1 and 100
        return new RectangleDisplay(width, height);
    }

    public static void main(String[] args) {
        // Testing the methods
        RectangleDisplay rec = RectangleDisplay.randomRec();
        System.out.println("Rectangle Width: " + rec.width);
        System.out.println("Rectangle Height: " + rec.height);
        System.out.println("Is Silly: " + rec.isSilly());
        System.out.println("Diagonal: " + rec.diagonal());
    }
}

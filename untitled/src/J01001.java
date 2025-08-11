import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        if (h <= 0 || w <= 0) {
            System.out.println(0);
            return;
        }

        Rectangle rectangle = new Rectangle(h, w);
        System.out.println(rectangle.getPerimeter() + " " + rectangle.getArea());

        sc.close();
    }
}

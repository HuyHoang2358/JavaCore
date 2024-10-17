// Định nghĩa interface Shape
interface Shape {
    // Phương thức tính chu vi
    double calculatePerimeter();

    // Phương thức tính diện tích
    double calculateArea();
}

// Định nghĩa class Hình Vuông (Square) triển khai Shape
class Square implements Shape {
    private double sideLength; // Độ dài cạnh của hình vuông

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Triển khai phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    // Triển khai phương thức tính diện tích
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

// Định nghĩa class Hình Chữ Nhật (Rectangle) triển khai Shape
class Rectangle implements Shape {
    private double length;  // Chiều dài
    private double width;   // Chiều rộng

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Triển khai phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Triển khai phương thức tính diện tích
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        // Khởi tạo một hình vuông với cạnh là 5
        Shape square = new Square(5);
        System.out.println("Hình vuông:");
        System.out.println("Chu vi: " + square.calculatePerimeter());
        System.out.println("Diện tích: " + square.calculateArea());

        // Khởi tạo một hình chữ nhật với chiều dài là 4 và chiều rộng là 6
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("\nHình chữ nhật:");
        System.out.println("Chu vi: " + rectangle.calculatePerimeter());
        System.out.println("Diện tích: " + rectangle.calculateArea());
    }
}

public class App {
    public static void main(String[] args) {

        // Số nguyên (Integer)
        int age = 25;
        long population = 7800000000L; // Sử dụng 'L' để chỉ định kiểu long
        short temperature = -5;
        byte level = 12;

        // Số thực (Floating-point)
        float price = 19.99f; // Sử dụng 'f' để chỉ định kiểu float
        double pi = 3.141592653589793;

        // Ký tự (Character)
        char grade = 'A';

        // Chuỗi (String)
        String name = "TechMaster";

        // Boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Mảng (Array)
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // In ra các giá trị
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Temperature: " + temperature);
        System.out.println("Level: " + level);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Fish Tasty? " + isFishTasty);
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Fruits: " + java.util.Arrays.toString(fruits));

        // Cấu trúc dữ liệu phức tạp (Class)
        Car myCar = new Car("Toyota", 2020, 30000.0);
        System.out.println("Car Model: " + myCar.model + ", Year: " + myCar.year + ", Price: " + myCar.price);

        // Biến tĩnh (Static Variable)
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Counter: " + Counter.count);

        // Biến hằng (Constant Variable)
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);
    }
}





class Car {
    String model;
    int year;
    double price;

    // Constructor
    Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
}

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
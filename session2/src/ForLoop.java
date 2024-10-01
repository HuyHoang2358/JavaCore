import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Tính tổng các số từ 1 -> 10
        int sum = 0;
        for (int num = 1; num<=10; num++){
            System.out.println("num = " + num);
            sum += num;
            System.out.println("sum = " + sum);
        }
        System.out.println("Tổng các số từ 1 -> 10 là: " + sum);
    }
}

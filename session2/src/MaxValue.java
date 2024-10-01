import java.util.Scanner;
import java.util.Scanner;
public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Nhập số thứ ba
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();

        if (num1 > num2  && num1 > num3){
            System.out.println("Số lớn nhất là: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Số lớn nhất là: " + num2);
        } else {
            System.out.println("Số lớn nhất là: " + num3);
        }
    }

}

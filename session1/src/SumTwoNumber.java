import java.util.Scanner;

public class SumTwoNumber {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ console
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính tổng
        int sum = (num1 + num2) * 2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;




        // Hiển thị kết quả
        System.out.println("Tổng của hai số là: " + sum);
        System.out.println("Hiệu của hai số là: " + sub);
        System.out.println("Tích của hai số là: " + mul);
        System.out.println("Thương của hai số là: " + div);
        System.out.println("Phần dư của hai số là: " + mod);

    }
}


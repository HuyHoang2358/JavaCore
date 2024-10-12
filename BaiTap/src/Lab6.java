import java.util.Scanner;

public class Lab6 {
    /*
    Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
     Ví dụ: Số 8545604 có tổng các chữ số là: 8 + 5 + 4 + 5 + 6 + 0 + 4 = 32
     */
    public static int sumOfDigits(int num) {
        // Solution
        int sum = 0; // Biến lưu tổng các chữ số

        while (num > 0) { // Lặp cho đến khi num = 0
            sum += num % 10;  // Lấy ra chữ số cuối cùng
            num /= 10; // Loại bỏ chữ số cuối cùng
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        int sum = sumOfDigits(n);
        System.out.println("Tổng các chữ số của " + n + " là: " + sum);

    }
}

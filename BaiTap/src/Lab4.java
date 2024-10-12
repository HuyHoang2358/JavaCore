import java.util.Scanner;

public class Lab4 {
    /*
    Viết chương trình liệt kê n số nguyên tố đầu tiên.
     */

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        // TODO: Liệt  kê n số nguyên tố
        int number = 2; // Số bắt đầu kiểm tra
        int count = 0; // Đếm số nguyên tố đã tìm ra
        while (count <n) {
            if (isPrime(number)) {
                System.out.print(number + "; ");
                count++;
            }
            number++;
        }
    }
}

import java.util.Scanner;
public class FizzBuzz {
    /*
        Viết chương trình thực hiện in ra các số từ 1 đến 100.
         Trong đó, những số nào chia hết cho 3 thì in chữ Fizz,
         những số nào chia hết cho 5 thì in chữ Buzz,
         những số nào chia hết cho cả 3 và 5 thì in chữ FizzBuzz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số n: ");
        int n = scanner.nextInt();

        int i = 1;         // khai báo biến counter
        while (i <= n) {   // Kiểm tra điều kiện dừng
            // TODO: coding
            if (i %  15 == 0) System.out.print("FizzBuzz");
            else if (i % 3 == 0) System.out.print("Fizz");
            else if (i % 5 == 0) System.out.print("Buzz");
            else System.out.print(i);
            System.out.print("; ");
            i++;            // tăng biến counter
        }
    }
}

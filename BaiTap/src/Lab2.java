import java.util.Scanner;

public class Lab2 {
    /*
    Bài 2: Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
     */

    public static int countDivisor(int num) {
        int count = 0;  //  Biến đếm số ước

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Ước: " + i + " ");
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        int count = countDivisor(n);
        System.out.println("Số ước số của " + n + " là: " + count);
    }
}

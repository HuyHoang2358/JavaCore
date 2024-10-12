import java.util.Scanner;

public class Lab11 {
    /*
    Nhập số tự nhiên n rồi tính các tổng sau:
        • S = tổng các số tự nhiên không lớn hơn n.
        • S1 = tổng các số tự nhiên lẻ không lớn hơn n.
        • S2 = tổng các số tự nhiên chẵn không lớn hơn n.
     */
    public static int sum(int n) {
        // Cách 1: Dùng vòng lặp for
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
        // Cách 2: Dùng công thức
        int sum = (1 + n)*n /2;
        return sum;
    }

    public static int sumOdd(int n) {
        // Cách 1: Dùng vòng lặp for
//        int sum = 0;
//        for (int i = 1; i <= n; i= i+2) sum += i;
//        return sum;
        // Cách 2: Dùng công thức
        int max_value = n;
        if (n%2 == 0) max_value = n-1;
        int sum = (1 + max_value)*((max_value - 1)/2 +1) /2;
        return sum;
    }
    public static int sumEven(int n) {
        // Cách 1: Dùng vòng lặp for
//        int sum = 0;
//        for (int i = 2; i <= n; i= i+2) sum += i;
//        return sum;
        // Cách 2: Dùng công thức
        int max_value = n;
        if (n % 2 != 0) max_value = n - 1;
        int sum = (2 + max_value) * ((max_value - 2) / 2 + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();


    }
}

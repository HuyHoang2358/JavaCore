import java.util.Scanner;

public class Sum {
    public static int sum(int n) {
        int sum = 0;
        // TODO: while loop

        // Cách 1
//        int num = 1;
//        while (num <= n) {
//            if (num % 2 == 0  && num % 3 == 0)  sum += num;
//            num++;
//        }
        // Cách 2
//        int num = 1;
//        while (num <= n) {
//            if (num % 6 == 0)  sum += num;
//            num++;
//        }
        // Cách 3
        int num = 6;
        while (num <= n) {
            if (num % 6 == 0) sum += num;
            num += 6;
        }

        return sum;
    }
    public static void main(String[] args) {
        // Tính tổng các số chia hết cho 2, 3 từ 1 -> n

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số n: ");
        int n = scanner.nextInt();

        int result = sum(n);
        System.out.println("Tổng các số chia hết cho 2, 3 từ 1 -> " + n + " là: " + result);
    }
}

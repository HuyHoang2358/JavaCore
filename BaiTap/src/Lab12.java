import java.util.Scanner;

public class Lab12 {
    /*
    Nhập vào 2 số tự nhiên m và n, sao cho m < n.
    Hãy liệt kê các số chính phương trong đoạn [m,n].
    Có bao nhiêu số chính phương?
     */

    // Hàm kiểm tra số chính phương
    public static boolean isSquareNumber(int num) {
        int sqrt = (int) Math.sqrt(num); // Lấy phần nguyên căn bậc 2 của num
        return sqrt*sqrt == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số m: ");
        int m = scanner.nextInt();
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        if (m >= n) {
            System.out.println("m phải nhỏ hơn n");
            return;
        }

        // Cách 1 dùng for loop
        int count = 0;
        for(int i = m; i <= n; i++) {
            count = count + 1;
            if (isSquareNumber(i)) System.out.print(i + "; ");
        }
        System.out.println("Số bước chạy C1: " + count);

        // Cách 2
        int min_sqrt = (int) Math.sqrt(m);
        int max_sqrt = (int) Math.sqrt(n);
        int count_step = 0;
        for(int i = min_sqrt; i <= max_sqrt; i++) {
            count_step = count_step + 1;
            System.out.print(i*i + "; ");
        }
        System.out.println("Số bước chạy C2: " + count_step);


    }

}

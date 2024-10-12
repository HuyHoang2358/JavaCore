import java.util.Scanner;

public class Lab6 {
    /*
      Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c ( với b < c).
      Tính trung bình cộng các phần tử của dãy nằm trong khoảng [b, c].
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số c: ");
        int c = scanner.nextInt();

        int sum = 0; // Tổng các phần tử trong khoảng [b, c]
        int count = 0; // Số lượng phần tử trong khoảng [b, c]

        for (int i = 0; i < n; i++) { // Duyệt qua từng phần tử trong mảng
            if (arr[i] >= b && arr[i] <= c) { // Nếu phần tử thứ i nằm trong khoảng [b, c]
                sum += arr[i]; // Cộng phần tử thứ i vào tổng
                count++; // Tăng biến đếm lên 1
            }
        }

        if (count == 0) {
            System.out.println("Không có phần tử nào trong khoảng [" + b + ", " + c + "]");
        } else {
            System.out.println("Trung bình cộng các phần tử trong khoảng [" + b + ", " + c + "] là: " + (double) sum / count);
        }

    }
}

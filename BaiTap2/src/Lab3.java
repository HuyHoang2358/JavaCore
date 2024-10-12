import java.util.Scanner;

public class Lab3 {
    /*
         Nhập số n và dãy các số nguyên a[0], a[1],..., a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.
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

        // Sắp xếp dãy số theo thứ tự tăng dần - Thuật toán sắp xếp nổi bọt
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Hoán đổi vị trí 2 số
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Dãy số sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}

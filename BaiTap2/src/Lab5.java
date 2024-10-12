import java.util.Scanner;

public class Lab5 {
    /*
     Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
     Tìm số lớn thứ hai và vị trí của nó trong dãy.
     Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
     -124, -125, -121
     */

    public static int findSecondLargest(int[] arr) {
        // Tìm giá trị lớn nhất
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];

        }

        // Tìm vị trí số lớn nhất trong dãy mà < max
        int index = -1; // mảng [0, length-1]
        int secondMax = -123;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int index = findSecondLargest(arr);
        if (index == -1) {
            System.out.println("Không có số lớn thứ 2 trong dãy số trên.");
        } else {
            System.out.println("Số lớn thứ 2 trong dãy số trên là: " + arr[index] + " và vị trí của nó là: " + index);
        }
    }
}

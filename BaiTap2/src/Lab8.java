import java.util.Scanner;

public class Lab8 {
    /*
    Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    In phần tử có số lần xuất hiện nhiều nhất trong a.
     */

    public static int findMaxNumElement(int[] arr) {
        int element = arr[0];
        int maxCount = 1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Đếm số phần tử bẳng phần tử arr[i] trong mảng arr
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }

        return element;
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

        int element = findMaxNumElement(arr);
        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + element);

    }
}

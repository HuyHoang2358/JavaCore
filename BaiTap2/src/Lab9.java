import java.util.Scanner;

public class Lab9 {
    /*
    Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên.
    In ra các số khác nhau trong dãy.
     */

    public static int[] uniqueArr(int[] arr) {
        boolean[] isExist = new boolean[arr.length]; // isExist[i] = true nếu arr[i] đã xuất hiện trong mảng arr[0..i-1] else -  false
        for (int i = 0; i < arr.length; i++) {
            isExist[i] = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isExist[i] = true;
                    break;
                }
            }
        }
        // Đếm số lượng phần tử khác nhau trong mảng
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isExist[i]) count++;
        }
        // Khai báo maảng để lưu các phần tử khác nhau
        int[] uniqueArr = new int[count];
        // Lưu các phần tử khác nhau vào mảng uniqueArr
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isExist[i]) {
                uniqueArr[index++] = arr[i];
            }
        }
        return uniqueArr;

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
        // In ra các phần tử khác nhau trong mảng
        int[] uniqueArr = uniqueArr(arr);
        System.out.println("Các phần tử khác nhau trong mảng: ");
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
        }

    }
}

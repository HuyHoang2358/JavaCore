public class Array {
    public static void main(String[] args) {
        // Khai báo mảng gồm 5 phần tử dùng để lưu trữ số nguyên
        int[] arr;
        arr = new int[10];

        // Gán giá trị cho các phần tử của mảng
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        System.out.println("Length of array: " + arr.length);

        // In ra các phần tử của mảng
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + "; ");
        }

    }
}

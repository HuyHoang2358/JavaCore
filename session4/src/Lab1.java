public class Lab1 {
    /*
    Viết hàm tính tổng các số lẻ và chia hết cho 3 trong mảng các số nguyên
     */



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        int sum = 0;

        for (int i = 0; i <= arr.length-1; i++) {

            // Kiểm tra điều kiện số lẻ và chia hết cho 3
            if (arr[i] % 2 == 1 && arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                sum += arr[i];
            }

        }


        System.out.println("Tổng các phần tử lẻ và chia hêt cho 3: " + sum);
    }
}

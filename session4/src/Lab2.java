public class Lab2 {
    /*
    Viết hàm tính tổng các số nguyên tố trong mảng
     */
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        int sum = 0;

        for (int i = 0; i <= arr.length-1; i++) {

            // Kiểm tra điều kiện số nguyên tố
            if (isPrime(arr[i])) {
                System.out.println("Số nguyên tố: " + arr[i]);
                sum += arr[i];
            }

        }

        System.out.println("Tổng các số nguyên tố trong mảng là: " + sum);
    }
}

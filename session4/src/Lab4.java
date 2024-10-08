public class Lab4 {
    /*
     Viết function để kiểm tra 1 giá trị có nằm trong mảng hay không?
     */
    // Trả về true nếu có, false nếu không
    public static boolean checkValue(int[] arr, int value) {
        // TODO: Viết code kiểm tra giá trị có nằm trong mảng hay không?

        for (int element : arr) { // For each loop phần tử element trong mảng arr
            System.out.println("element: " + element);
            if (element == value) return true; // = break; out of loop
        }

        return false;
    }

    // Trả về vị trí đầu tiên của giá trị trong mảng, nếu không có trả về -1
    public static int findValue(int[] arr, int value) {
        // TODO: Viết code tìm vị trí của giá trị trong mảng

        for (int i = 0; i < arr.length; i++) // For loop: i là index của mảng arr (số thứ tự của phần tử trong mảng)
            if (arr[i] == value) return i;

        return -1; // Thường dùng để biểu thị không tìm thấy giá trị trong mảng
    }

    public static void main( String[] args ) {
        int[] arr = {10, 30, 10, 50, 40, 6, 9};

        // Gọi hàm kiểm tra giá trị có nằm trong mảng hay không?
        System.out.println(checkValue(arr, 50)); // true
        System.out.println(checkValue(arr, 10)); // false

        // Gọi hàm tìm vị trí của giá trị trong mảng
        System.out.println(findValue(arr, 5)); // 4
        System.out.println(findValue(arr, 10)); // -1

    }
}
// env - jdk

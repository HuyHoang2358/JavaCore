public class Lab5 {
    /*
    Viết hàm  xóa các phần tử có giá trị bằng k trong một mảng và trả về mảng mới
     */
    //  int[] arr = [10, 30, 10, 50, 40, 6, 9];
    /*
        index: 0 -> 1 -> 2 -> 3 -> 4 -> 5
        newArr[30, 50, 40, 6,  9]
     */

    public static int[] removeElement(int[] arr, int k) {
        // TODO: Viết code xóa các phần tử có giá trị bằng k trong một mảng và trả về mảng mới

        // Đếm số phần tử khác k trong mảng
        int new_length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                new_length++;
            }
        }

        // kHởi tạo mảng mới
        int[] newArr = new int[new_length]; // số phân tử của mảng mới <= số phần tử của mảng cũ

        // Copy các phần tử khác k vào mảng mới
        int index = 0; // index của mảng mới
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main( String[] args ) {
        int[] arr = {10, 30, 10, 50, 40, 6, 9};

        // Gọi hàm xóa các phần tử có giá trị bằng k trong một mảng và trả về mảng mới
        int[] newArr = removeElement(arr, 10);

        for (int element : newArr) {
            System.out.println(element);
        }
    }
}

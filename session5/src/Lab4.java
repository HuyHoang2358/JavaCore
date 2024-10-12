public class Lab4 {
    /*
        Viết hàm tìm chuỗi dài nhất trong mảng chuỗi
        String[] arr = {"hello", "world", "java", "programming"};
     */

    public static String findLongestString(String[] arr) {
        // TODO: Viết code tìm chuỗi dài nhất trong mảng chuỗi
        String longestString = arr[0]; // giả sử chuỗi đầu tiên là chuỗi dài nhất

        // Cách 1
//        for (int i = 1; i < arr.length; i++) { // duyệt từ phần tử thứ 2 của mảng
//            if (arr[i].length() > longestString.length()) { // nếu chuỗi thứ i dài hơn chuỗi dài nhất
//                longestString = arr[i]; // thì cập nhật chuỗi dài nhất là chuỗi thứ i
//            }
//        }

        // Cách 2 sử dụng ForEach
        for(String str : arr) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        return longestString;
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java", "programming"};

        // Gọi hàm tìm chuỗi dài nhất trong mảng chuỗi
        String longestString = findLongestString(arr);
        System.out.println("Chuỗi dài nhất trong mảng là: " + longestString);
    }
}

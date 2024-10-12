public class Lab2 {
    /*
    Viết 1 hàm với tham số là chuỗi str1 và chuỗi str2 có cùng độ dài.
    Kiểm tra xem 2 chuối có phải là nghịch đảo của nhau không.
    Ví dụ: str1 = "abc", str2 = "cba" => true
    str1 = "abc", str2 = "bac" => false

    // solution:
    str1 = "abcdef", str2 = "fedcba"
    0 - 5 =  n-1
    1 - 4 =  n-2
    2 - 3 =  n-3
    3 - 2 = n-4
    n = str1.length = str2.length
    i: vi trí ký tự đang xét ở chuỗi 1 ||  0 -> n-1
    => vị trí cần kiểm tra ở chuỗi 2 là  n-i-1

     */
    public static boolean  isReverse(String str1, String str2) {
        // TODO: Viết code kiểm tra 2 chuỗi có phải là nghịch đảo của nhau không
        if(str1.length() != str2.length()) return false;

        int length_str = str1.length(); // Độ dài của chuỗi
        for (int i = 0; i < str1.length(); i++) { // Duyệt qua từng ký tự của chuỗi 1
            // Kiểm tra ký tự tại vị trí i của chuỗi 1 có bằng ký tự tại vị trí n-i-1 của chuỗi 2 không
            if (str1.charAt(i) != str2.charAt(length_str - i - 1)) {
                return false; // 1 trường hop sai => 2 chuỗi không phải là nghịch đảo của nhau
            }

        }
        // Không có trường hợp nào sai => 2 chuỗi là nghịch đảo của nhau
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "fedcba";

        if (isReverse(str1, str2)) System.out.println("2 chuỗi là nghịch đảo của nhau");
        else System.out.println("2 chuỗi không phải là nghịch đảo của nhau");

    }
}

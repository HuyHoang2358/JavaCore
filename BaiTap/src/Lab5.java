import java.util.Scanner;

public class Lab5 {
    /*
    Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái số đó
     ta vẫn nhận được một số giống nhau.
      Hãy nhập một số và kiểm tra xem số đó có phải số thuận nghịch hay không
      (ví dụ số: 558855 hoặc 123321 hoặc 12321).
     */
    public static boolean isSymmetryNumber(int num) {
        // Solution
        int temp = num; // Biến tạm dùng để lưu giá trị của số ban đầu
        int reverseNum = 0; // số nghịch đảo
        while (temp > 0) {
            // Temp % 10: lấy ra chữ số cuối cùng
            reverseNum = reverseNum * 10 + temp % 10;
            temp /= 10; // Loại bỏ chữ số cuối cùng
        }

        return reverseNum == num; // Kiểm tra số nghịch đảo có bằng số ban đầu không
    }

    //
    public static boolean isPalindrome(String num) {
        int num_length = num.length();
        for (int i = 0; i < num_length; i++) {
            if (num.charAt(i) != num.charAt(num_length - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        if (isSymmetryNumber(n)) System.out.println(n + " là số thuận nghịch");
        else  System.out.println(n + " không phải là số thuận nghịch");

        // convert n to string
        String n_str = String.valueOf(n);
        if (isPalindrome(n_str)) System.out.println(n + " là số thuận nghịch");
        else  System.out.println(n + " không phải là số thuận nghịch");
    }

}

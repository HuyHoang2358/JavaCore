import java.util.Scanner;

public class Main {
    public static String copyString(String str, int n) {
        StringBuilder result = new StringBuilder();

        int i = 0;                               // khai báo biến counter
        while (i < n) {                          // kiểm tra điều kiện dừng
            result.append(str);
            if (i < n - 1) result.append("-");
            i++;                                 // tăng biến counter
        }
// Cách 2: Sử dụng vòng lặp for
//        for (int i = 0; i < n; i++) {   khai báo; điều kiện dừng; tăng biến counter
//            result.append(str);
//            if (i < n - 1) {
//                result.append("-");
//            }
//        }
        return result.toString();
    }

    public static void main(String[] args) {
        //Viết function truyền vào 1 chuỗi bất kỳ, hãy viết hàm có tác dụng sao chép đó chuỗi lên 10 lần, ngăn cách nhau bởi dấu gạch ngang
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();

        String result = copyString(str, 10);
        System.out.println(result);
    }
}
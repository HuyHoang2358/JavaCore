import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Nhập số cần kiểm tra
        System.out.print("Nhập số cần kiểm tra: ");
        int num1 = scanner.nextInt();

        // Kiểm tra số đó là số chẵn hay số lẻ
        if (num1 % 2 == 0) {
            System.out.println(num1 + " là số chẵn");
        } else {
            System.out.println(num1 + " là số lẻ");
        }

        System.out.println("Kết thúc chương trình");
    }
}
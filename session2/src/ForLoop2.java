import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //In ra màn hình các số lẻ từ 1 -> num;

        System.out.print("Nhập vào một số: ");
        int num = scanner.nextInt();

        System.out.println("_______________________ C1_______________________");
        // Cách 1: Sử dụng vòng lặp for
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("_______________________ C2_______________________");
        // Cách 2: Sử dụng for với bước nhảy là 2
        for (int i = 1; i <= num; i += 2) {
            if (i == 5) continue;
            System.out.println(i);
        }

        System.out.println("_______________________ C2_______________________");
        // Cách 2: Sử dụng for với bước nhảy là 2
        for (int i = 1; i <= num; i += 2) {
            if (i == 5) break;
            System.out.println(i);
        }

    }
}


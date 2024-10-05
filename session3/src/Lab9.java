import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số thứ nhất
        System.out.print("Nhập vào chiều cao tam giác: ");
        int h = scanner.nextInt();


        for (int row = 1; row <= h; row++) {
            for (int col=1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

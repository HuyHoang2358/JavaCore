import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số thứ nhất
        System.out.print("Nhập vào số hàng ");
        int numRow = scanner.nextInt();

        // Nhập vào số thứ hai
        System.out.print("Nhập vào số cột: ");
        int numCol = scanner.nextInt();

        for (int row = 1; row <= numRow; row++) {
            for (int col=1; col <= numCol; col++) {
                if (row >=2 && row <= numRow - 1) {
                    if (col == 1 || col == numCol) System.out.print("* ");
                    else System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số thứ nhất
        System.out.print("Nhập vào chiều cao tam giác: ");
        int h = scanner.nextInt();
        // h= 4
        // hàng 1 : 1 * = 1 x 2 -1 ;  vị trí h - 1 = h - row + 1
        // hàng 2 : 3 * = 2 x 2 -1 :  vị trí h - 2 = h - row + 1
        // hàng 3 : 5 * = 3 x 2 -1 :  vị trí h - 3 = h - row + 1
        // hàng 4 : 7 * = 4 x 2 -1 :  vị trí h - 4 = h - row + 1
        // => số dấu * = row x 2 - 1

        for (int row = 1; row <= h; row++){
            // In ra ký tự rỗng
            for(int space = 1; space <= h-row; space++){
                System.out.print("  ");
            }
            // In ra ký tự *
            for (int star = 1; star <= row * 2 - 1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

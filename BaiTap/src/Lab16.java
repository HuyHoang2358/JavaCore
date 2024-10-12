import java.util.Scanner;

public class Lab16 {
    /*
    Giải bài toán tính số PI theo công thức sau
     */

    public static double calculatePI(double  c) {
        // DK: 1/(2 *n +1) <= c
        double n=0;
        double pi = 0;
        while( 1/(2*n+1) <=c){

            if (n % 2 == 0) pi += (double) 1 / (2 * n + 1);
            else pi -= (double) 1 / (2 * n + 1);

            n++;
        }

        return pi*4;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số thực c: ");
        double c = scanner.nextDouble();

        double pi = calculatePI(c);
        System.out.println("Số PI theo công thức là: " + pi);

    }
}

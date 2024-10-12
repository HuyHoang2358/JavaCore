import java.util.Scanner;

public class Lab3 {
    /*
    : Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.
     */
    // Tìm UCLN
    // Đệ quy - Cách 1
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    // GCD - Greatest Common Divisor - Cách 2 đơn giản
    public static int findGCD2(int a, int b) {
        int ucln = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) ucln = i; // i là ước chung lớn nhất
        }
        return ucln;
    }

    // công thức tính BCNN = a*b /UCLN
    // LCM = Least Common Multiple
    public static int findLCM(int a, int b) { // Tìm bội chung nhỏ nhất
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();

        int ucln = findGCD(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);

        int bcnn = findLCM(a, b);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + bcnn);
    }
}

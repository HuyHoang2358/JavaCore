import java.util.Scanner;

public class ThreeNumber {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ console
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        byte num1 = scanner.nextByte();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        byte num2 = scanner.nextByte();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ ba: ");
        byte num3 = scanner.nextByte();

        // Tính tổng
        int sum = num1 + num2 + num3;

        // Tìm số lớn nhất của 3 số
        byte max_value = num1;
        if (num2 > max_value) max_value = num2;
        if (num3 > max_value) max_value = num3;

        // C2
        //max_value = Math.max(num1, Math.max(num2, num3));

        // Tính trung bình công của 3 số
        double average = (double) (sum) / 3;

        System.out.println("Tổng của ba số là: " + sum);
        System.out.println("Số lớn nhất trong ba số là: " + max_value);
        System.out.println("Trung bình cộng của ba số là: " + average);
    }
}


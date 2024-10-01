import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số
        System.out.print("Nhập vào một số: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            default:
                System.out.println("Số không nằm trong khoảng từ 1 đến 5");
        }

    }

}

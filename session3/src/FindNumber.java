import java.util.Scanner;
public class FindNumber {
    /*
    Viết chương trình thực hiện:
        1 - Sinh một số nguyên ngẫu nhiên rdNumber
        2 - Nhập vào bàn phím số nguyên bất kỳ number

        Nếu number > rdNumber thì thông báo bạn đoán lớn hơn rồi, và cho nhập lại
        Nếu number < rdNumber thì thông báo bạn đoán nhỏ hơn rồi và cho nhập lại
        Nếu number == rdNumber thì thông báo bạn đoán trúng rồi và kết thúc chương trình
        Hãy tự làm bài trước rồi mới xem video để so sánh kết quả nhé
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sinh một số nguyên ngẫu nhiên với hàm random()
        int num = (int) (Math.random() * 100);
        int guessNum;

        do {
            System.out.print("Nhập vào một số: ");
            guessNum = scanner.nextInt();

            if (guessNum > num) System.out.println("Số bạn nhập lớn hơn số cần tìm");
            else if (guessNum < num) System.out.println("Số bạn nhập nhỏ hơn số cần tìm");
            else {
                System.out.println("Bạn đoán trúng rồi");
                System.out.println("Số cần tìm là: " + num);
            }
        } while(guessNum != num);

        System.out.println("Kết thúc chương trình");
    }
}

//  Thanh: 7
// Thắng: 10
// Trinh:  2
// Nam: 13
// Linh:
//  1 ----------------50 ---- 62 -65 66 67- 69 -- 75 ------- 100
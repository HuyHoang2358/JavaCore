public class FizzBuzz_failCode {
    public static void main(String[] args) {
        int i = 1; // khai báo biến counter
        while (i <= 100) {  // Kiểm tra điều kiện dừng
            //TODO : coding
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
        i++; // tăng biến counter
    }
}





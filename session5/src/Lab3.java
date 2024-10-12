public class Lab3 {
     /*
        Viết hàm để đếm số ký tự viết hoa,
        Viết hàm  để đếm số ký tự số trong một chuỗi.
        Ví dụ:
        str = "Abc1234Def"
        countUppercase(str) => 3
        countDigit(str) => 4

      */

     public static int countUppercase(String str) {
         // TODO: Viết code đếm số ký tự viết hoa trong chuỗi
         // ">='A' && <= 'Z'"
         int count = 0;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                 count++;
             }
         }
         return count;

     }

     public static int countDigit(String str) {
         // TODO: Viết code đếm số ký tự số trong chuỗi
         //  ">='0' && <= '9'"
         int count = 0;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                 count++;
             }
         }
         return count;
     }

     public static void main(String[] args) {
         String str = "Abc1234Def";
         System.out.println("Số ký tự viết hoa trong chuỗi: " + countUppercase(str));
         System.out.println("Số ký tự số trong chuỗi: " + countDigit(str));


     }

}

public class Lab1 {
    /*
        Viết 1 hàm  chuyển 1 chuối bất kỳ thành 1 chuỗi in hoa tất cả các chữ cái
     */

    public static String preprocessing(String str) {
        System.out.println("Độ dài chuỗi trước xử lý: " + str.length());
        str = str.trim(); // Xóa khoảng trắng 2 bên đầu chuỗi

        while(str.contains("  ")){  // Nếu chuỗi còn chứa 2 dấu cách cạnh nhau
            str = str.replace("  ", " "); // Thì thay thế 2 dấu cách cạnh nhau bằng 1 dấu cách
        }

        System.out.println("Độ dài chuỗi sau xử lý: " + str.length());
        return str;
    }
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "  hello       world      ";
        str = preprocessing(str);

        str = str + "! I'm a student";
        char ch = str.charAt(4); // trả về ký tự tại vị trí thứ 4 của chuỗi
        System.out.println("Ký tự thu 4: " + ch);


        // Thay thế ký tự thứ 4 của chuoi thanh 9
        //str[4] = '9'; // Khoong the sư dung cach nay vi chuoi trong java la immutable
        // Cách 1: Dùng hàm substring
        str = str.substring(0, 4) + '9' + str.substring(5);  // lấy ra chuỗi con tu 0 -> 4 và 5 -> hết chuỗi

        // Cách 2: Dùng StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(4, '9');
        str = sb.toString();


        System.out.println(str);
    }
}

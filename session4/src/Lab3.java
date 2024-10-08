public class Lab3 {
    /*
        Viết function cho phép truyền vào 1 mảng các số,
         kết quả trả về là 1 mảng mới với các số là số dư tương ứng khi chia mảng cũ cho 2
    */
    public static int[] remainderArray(int[] inputArr){
        // Khai báo mảng mới để lưu trữ kết quả
        int[] resultArr = new int[inputArr.length];

        //  inputArr.length = 5
        //  for (int i = 0; i <=  5-1; i++) ~ for (int i = 0; i <= 4; i++) || i = 0, 1, 2, 3, 4
        //  for (int i = 0; i <  5; i++) ~ for (int i = 0; i < 5; i++) || i=  0, 1, 2, 3, 4
        for (int i = 0; i < inputArr.length; i++) {
            resultArr[i] = inputArr[i] % 2;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9};

        // Gọi hàm và lưu kết quả vào mảng mới
        int[] ansArr = remainderArray(arr);

        // In ra mảng mới
        for (int i = 0; i < ansArr.length; i++) {
            System.out.print(ansArr[i] + "; ");
        }

    }

}

package fu.util;

public class MathUtility {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 - 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

// expected value == actual value
// case (tình huống) n = 5 hàm trả về 120 -> hàm đúng
// case              n = 6 hàm trả về 720 -> hàm đúng
// làm các case mà mk nghĩ là ng dùng sẽ xài hàm như thế -> test case
// hàm có nhiều test case ứng với nhiều tình huống xài hàm
// đảm bảo đúng cho các cases thì mới release
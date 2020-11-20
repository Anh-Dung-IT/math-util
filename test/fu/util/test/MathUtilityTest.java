package fu.util.test;

import static fu.util.MathUtility.*;
import java.sql.SQLException;

// chỉ có từ JDK 5, chi dành cho static
// khi gọi hàm static thì ko cần gọi class
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest {

    public MathUtilityTest() {
    }

    // class này là class xài bộ thư viện Jnuit dùng để test code theo dạng xanh đỏ, thay vì nhìn bằng mắt
    // 2 file .jar đã đc add vào project này
    // trong các hàm của thư viện này có n hàm đặc biệt có tên xuất phát là assertX(expected, actual đưa vào)
    // nếu nó thấy expected ko bằng actual -> màu đỏ, ngược lại thì xanh
    @Test   // biến hàm ngay sau đây thành public static void main() -> F6 để chạy
    // quy tắc đặt tên hàm của tester / QC
    public void getFactorial_RunsWell_IfValidArgument() {

        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {

        // ngoại lệ ko phải value để assert()
        // chỉ có thể chụp nó lại
        getFactorial(-5);
    }

}

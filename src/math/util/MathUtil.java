package math.util;

import fu.util.MathUtility;

public class MathUtil {

    public static void main(String[] args) {
        // kỹ thuật test căn bản: nhìn bằng mắt các test casé để kết luận hàm đúng or sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);

        System.out.println("5! ? expected: " + expected + "; actual: " + actual);
        
        System.out.println("6! ? expected: 720; actual: " + MathUtility.getFactorial(6));
        
        System.out.println("0! ? expected: 1; actual: " + MathUtility.getFactorial(0));
        
        MathUtility.getFactorial(-5);
    }

}

// Nhược điểm:
//      cần phải dùng mắt để so sánh từng trường hợp xài hàm: so expected vs actual
//      nêws test nhiều thì mỏi mắt

// cách nâng cao
// gom cả đám test cases này lại, chạy 1 lượt như ở trên
// máy so giùm ta luôn
// sau đó
// nếu tất cả các cases mà đều đúng, đưa ra 1 màu xanh -> code ổn
// nếu tất cả các cases đều đúng, ngoại trù có 1, 2, một vài thằng nào đó
// expected khác actual, thảy ra màu đỏ, hàm sai -> ko tin cậy hàm

// thay vì nhìn từng case, ta chỉ nhìn màu xanh or đỏ là đủ r
// ta cần thêm bộ thư viện nó làm 2 việc
// so sánh giùm
// đẩy ra màu xanh or đỏ
// nó tự quét hết các case mà mk đã thiết kế để nó kết luận
// bộ thư viện này chính là file .jar .dll đc add thêm vài project
// bộ thư viện này mang tên chung cho mọi ngôn ngữ lập trình - Unit test
// Java: JUnit, TestNG
// C#: NUnit
// php: PHPUnit

// đưa code lên server đã
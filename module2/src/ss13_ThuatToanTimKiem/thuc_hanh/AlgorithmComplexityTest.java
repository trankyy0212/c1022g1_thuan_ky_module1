package ss13_ThuatToanTimKiem.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        int[] frequentChar = new int[255];
//        Tìm ví trí tương ứng của ký tự trong bảng ASCII
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
//            Tăng giá trị tần suất
            frequentChar[ascii] += 1;
        }
        int max = 0;
//        ép kiểu số sang chữ
        char character = (char) 255;
        System.out.println(character);
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}

package javaPractice14;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            System.out.printf("s[%d] = %c %4X\n", i, s.charAt(i), (int)s.charAt(i));
        }
    }
}

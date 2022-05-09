package javaPractice14;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String s =sc.next();

        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }

    }
}

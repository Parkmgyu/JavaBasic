package javaPractice7;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();
        System.out.println("중간값은 " + med(a, b, c) + "입니다.");
    }
    public static int med(int a, int b, int c){
        int result = (a + b + c) / 3;
        return result;
    }
}

package javaPractice7;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수를 생성합니다.");
        System.out.print("하한값: ");
        int a = sc.nextInt();
        System.out.print("상한값: ");
        int b = sc.nextInt();
        System.out.println("생성한 난수는 " + random(a, b) + "입니다.");
    }
    public static int random(int a, int b){
        return (int)((b - a + 1) * Math.random()) + a;
    }
}

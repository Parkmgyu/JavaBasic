package javaPractice;

import java.util.Scanner;

public class practice22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5,  sum = 0;
        System.out.print("정수 값 입력 : ");
        num1 = sc.nextInt();
        System.out.print("정수 값 입력 : ");
        num2 = sc.nextInt();
        System.out.print("정수 값 입력 : ");
        num3 = sc.nextInt();
        System.out.print("정수 값 입력 : ");
        num4 = sc.nextInt();
        System.out.print("정수 값 입력 : ");
        num5 = sc.nextInt();
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("결과값 : " + sum);
    }
}

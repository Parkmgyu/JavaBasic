package javaPractice;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("1번째 정수 입력 : ");
        num1 = sc.nextInt();
        System.out.print("2번째 정수 입력 : ");
        num2 = sc.nextInt();
        result = num1 / num2 * num2;
        System.out.println("결과값 : " + result);
    }
}

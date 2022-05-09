package javaPractice;

import java.util.Scanner;

public class practice32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 정수 값 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("2번째 정수 값 입력 : ");
        int num2 = sc.nextInt();

        int ans1 = addMethod(num1, num2);
        int ans2 = minMethod(num1, num2);
        int ans3 = mulMethod(num1, num2);
        int ans4 = div1Method(num1, num2);
        int ans5 = div2Method(num1, num2);

        System.out.println("값의 합 : " + ans1);
        System.out.println("값의 차 : " + ans2);
        System.out.println("값의 곱 : " + ans3);
        System.out.println("값의 몫 : " + ans4);
        System.out.println("값의 나머지 : " + ans5);
    }
    static int addMethod(int x, int y){
        int sum = x + y;
        return sum;
    }
    static int minMethod(int x, int y){
        int minus = x - y;
        return minus;
    }
    static int mulMethod(int x, int y){
        int mul = x * y;
        return mul;
    }
    static int div1Method(int x, int y){
        int div1 = x / y;
        return div1;
    }
    static int div2Method(int x, int y){
        int div2 = x % y;
        return div2;
    }
}

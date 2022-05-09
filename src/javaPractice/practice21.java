package javaPractice;

import java.util.Scanner;

public class practice21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();
        int fac = 1;
        if(num <= 0){
            fac = 1;
        } else {
            for(int i = 1; i <= num; i++){
                fac *= i;
            }
        }
        System.out.println("결과값 : " + fac);
    }
}

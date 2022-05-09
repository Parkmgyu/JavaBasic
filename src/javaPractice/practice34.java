package javaPractice;

import java.util.Scanner;

public class practice34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();
        if(num < 0){
            num = num * (-1);
        }
        System.out.println("절대값 : " + num);
    }
}

package javaPractice;

import java.util.Scanner;

public class practice26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();

        if(num >= 1 && num < 9){
            System.out.println(num + "은 입력 값입니다.");
        } else if (num == 9){
            System.out.println(num + "은 입력 값이고 " + (num + 1) + "은 입력 값 이외입니다.");
        }
    }
}

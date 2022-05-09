package chap06Exercise;

import java.util.Scanner;

public class Practice0601 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("입력숫자["+ a+"]는 짝수입니다.");
        }else{
            System.out.println("입력숫자["+ a+"]는 홀수입니다.");
        }
    }
}

package javaPractice;

import java.util.Scanner;

public class practice24_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if (num > 5) {
                if(i % 6 == 0){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
        }
    }
}

package javaPractice;

import java.util.Scanner;

public class practice20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        if(num <= 0){
            sum = 0;
        } else{
            for(int i = 1; i <= num; i++){
                sum += i;
            }
        }
        System.out.println("결과값 : " + sum);
    }
}

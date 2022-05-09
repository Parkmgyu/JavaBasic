package chap08Exercise;

import java.util.Scanner;

public class Practice0802 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avr = 0.0;
        int[] num = new int[5];
        for(int i = 0; i < num.length; i++){
            System.out.print((i+1)+"번째 숫자 입력: ");
            num[i] = sc.nextInt();
            sum += num[i];
            avr = (double)sum/num.length;
        }
        System.out.println("====================");
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avr);
    }
}

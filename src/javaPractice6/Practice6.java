package javaPractice6;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, avg = 0;
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("정수: ");
            num[i] = sc.nextInt();
            total += num[i];

            if(total > 1000){
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막값은 무시합니다.");
                total -= num[i];
                avg = total / i;
                break;
            }

            avg = total / n;
        }
        System.out.println("합계: " + total);
        System.out.println("평균: " + avg);

    }
}

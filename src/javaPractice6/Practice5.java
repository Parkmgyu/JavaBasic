package javaPractice6;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        practice5();
    }
    public static void practice5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 n번까지의 합을 구합니다. n의 값: ");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.print("1부터 n까지의 합이 " + sum + "입니다.");
    }
}

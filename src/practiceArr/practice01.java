package practiceArr;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("정수 입력 : ");
            arr[i] = sc.nextInt();
            arr[i] = arr[i] * 2;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

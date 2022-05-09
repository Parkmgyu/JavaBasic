package practiceArr;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("정수 입력 : ");
            arr[i] = sc.nextInt();
            total += arr[i];
            if(total > 100){
                break;
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

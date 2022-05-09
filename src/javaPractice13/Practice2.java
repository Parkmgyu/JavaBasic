package javaPractice13;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("요소수: ");

        int index = sc.nextInt();
        int[] arr = new int[index];
        int rest = 0;

        for(int i = 0; i < index; i++){
            arr[i] = 1 + rd.nextInt(10);
        }

        for(int i = 10; i >= 1; i--){
            for(int j = 0; j < index; j++){
                if(arr[j] >= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < 2 * index; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i < index; i++){
            System.out.print(i % 10 + " ");
        }
        System.out.println();

    }
}

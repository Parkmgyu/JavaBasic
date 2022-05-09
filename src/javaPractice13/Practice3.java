package javaPractice13;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int index = sc.nextInt();
        double[] arr = new double[index];
        double sum = 0.0, avg = 0.0;

        for(int i = 0; i < arr.length; i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
            avg = sum / index;
        }
        System.out.println("모든 요소의 합: " + sum);
        System.out.println("모든 요소의 평균: " + avg);
   }
}

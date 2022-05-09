package practice323;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        practice01();
    }
    public static void practice01(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}

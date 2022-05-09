package practice323;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        practice05();
    }
    private static void practice05(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                num /= i;
                if(num == i){
                    System.out.print(i);
                } else {
                    System.out.print(i + "x");
                }
            }
        }
    }
}

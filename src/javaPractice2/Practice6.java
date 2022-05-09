package javaPractice2;

public class Practice6 {
    public static void main(String[] args) {
        for(int num = 10; num <= 100; num++){
            if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 ){
                continue;
            } else{
                System.out.println(num);
            }

        }
    }
}

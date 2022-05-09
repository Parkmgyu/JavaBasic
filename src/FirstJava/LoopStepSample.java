package FirstJava;

public class LoopStepSample {
    public static void main(String[] args) {
/*        for(int i = 1; i <= 5; i++){
            for (int j = 6; j > i; j--){
                System.out.print("0");
            }
 //           System.out.print("0".repeat(6-i));
            System.out.println();
        }*/
        for(int i = 5; i >= 1; i--){
           /* for(int j = 0; j < i; j++){
                System.out.print("0");
            }*/
        System.out.print("0".repeat(i));
            System.out.println();
        }
    }
}

package Exercise1;

public class Practice7 {
    public static void main(String[] args) {
/*        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                if((j >= i) && (j <= 8 - i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        int max = 5;
        String star = "*";

        for(int i = 0; i < max; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= max * 2 - (i * 2) - 2; k++){
                System.out.print(star);
            }
            System.out.println("\n");
        }
    }
}

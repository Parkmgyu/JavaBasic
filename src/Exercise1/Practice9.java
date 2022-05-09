package Exercise1;

public class Practice9 {
    public static void main(String[] args) {
/*        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                if(j < 5 - i){
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
            for(int j = 0; j < max - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(star);
            }
            System.out.println("\n");
        }
    }
}

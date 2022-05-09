package Exercise1;

public class Practice8 {
    public static void main(String[] args) {
 /*       for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j <= i){
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
            for(int j = 0; j <= i; j++){
                System.out.print(star);
            }
            System.out.println("\n");
        }
    }
}

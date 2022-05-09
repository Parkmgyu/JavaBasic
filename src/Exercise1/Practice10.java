package Exercise1;

public class Practice10 {
    public static void main(String[] args) {
/*        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                if((j >= 4 - i) && (j <= 4 + i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i < 5; i++){
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
            for(int j = 0; j < max - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= ((i - 1) * 2); k++){
                System.out.print(star);
            }
            System.out.println("\n");
            if(i == 4){
                for(int a = 0; a < max; a++){
                    for(int b = 0; b < a; b++){
                        System.out.print(" ");
                    }
                    for(int c = 0; c <= (max * 2 - (a * 2) - 2); c++){
                        System.out.print(star);
                    }
                    System.out.println("\n");
                }
            }
        }
    }
}

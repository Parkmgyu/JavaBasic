package javaPractice2;

public class Practice7 {
    public static void main(String[] args) {
        int level = 5;

        for(int i = 0; i < level; i++){
            for(int j = 0; j < level + i; j++){
                if(j < level - i - 1){
                    System.out.print("□");
                } else{
                    System.out.print("■");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < level; i++){
            for(int j = 0; j < level - i - 1; j++){
                System.out.print("□");
            }
            for(int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("■");
            }
            System.out.println();
        }

    }
}

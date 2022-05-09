package practicefor;

public class Practice01 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i == 3){
                    if((i*j) % 3 == 0) {
                        System.out.println(i * j);
                    }
                }
            }
        }
    }
}

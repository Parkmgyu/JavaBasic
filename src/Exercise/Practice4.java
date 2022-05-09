package Exercise;

public class Practice4 {
    public static void main(String[] args) {
        for(int i = 21; i <= 29; i++){
            for(int j = 3; j <= 9; j++){
                if(i % j == 0){
                    System.out.println(i + "는 " + j + "의 배수");
                }
            }
        }
    }
}

package chap07Exercise;

public class Practice0701 {

    public static void main(String[] args){
        int total = 0, i = 1;
        while(i <11){
            total += i;
            i++;
        }
        /*for(int i = 1; i <= 10 ; i++){
            total = total + i;
        }*/

        System.out.println("1~10의 합계는 "+ total +"입니다.");
    }
}

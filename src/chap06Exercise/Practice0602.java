package chap06Exercise;

public class Practice0602 {
    public static void main(String[] args){
        //1-2
        int num = 6, num1 = 5, num2 = 999, month = 4, i = 1, w = 2, a = 3, b = 11, c = 9, x = 3, y = 10, z = 7;
        char char1 = 'y';
        String str1 = "yes";
        if(num >= 0 && num <= 9){
            System.out.println("변수 num은 0 이상 9 이하");
        }else if(num < 0 || num > 9){
            System.out.println("변수 num은 0 보다 작거나 9 보다 큼");
        }
        //3
        if(num1 == 5 && num2 == 999) {
            System.out.println("변수 num1은 5와 같고 변수 num2는 999와 같음. ");
        }
        //4
        if(char1 == 'y' || str1.equals("yes")){
            System.out.println("변수 char1은 \"y'\"와 같거나 변수 num2는 \"yes\"와 같음.");
        }
        //5-8
        if(month >= 3 && month <=5) {
            System.out.println("변수 month는 3 이상 5 이하");
        }else if(month >= 6 && month <=8){
            System.out.println("변수 month는 6 이상 8 이하");
        }else if(month >= 9 && month <=11) {
            System.out.println("변수 month는 9 이상 11 이하");
        }else if(month >= 12 || (month > 0 && month <= 2)){
            System.out.println("변수 month는 12와 같거나 0보다 크고 2 이하");
        }
        //9
        if((i != w) && (num1 == num2)) {
            System.out.println("변수 i와 w가 같지 않고 변수 num1과 num2가 동일함.");
        }
        //10
        if((a == x) || (b == y) || (c == z)) {
            System.out.println("변수 a와 x가 같거나 변수 b와 y가 같거나 변수 c와 z가 같음.");
        }
    }
}

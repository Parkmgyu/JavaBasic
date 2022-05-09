package Exercise;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이: ");
        int age = sc.nextInt();

        if(age >= 20){
            System.out.println("성인입니다.");
        }else if(age < 20 && age > 0){
            System.out.println("미성년입니다.");
            if(age < 6 || age > 14){
                System.out.println("지금은 의무교육을 받지 않음");
            } else{
                System.out.println("지금은 의무교육을 받고 있습니다.");
            }
        } else{
            System.out.println("오류");
        }
    }
}

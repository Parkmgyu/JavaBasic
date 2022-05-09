package FirstJava;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public static void main(String[] args) {
        var data = List.of("apple", "orange", "watermelon");

        var result = new ArrayList<String>();
        var result1 = 0;
        boolean result2 = true;
        boolean result3 = true;
        for(String s : data){
            if(s.length() >= 5){
                result.add(s);
                result1++;
                if(s.contains("p")){
                    result2 = true;
                }else{
                    result2 = false;
                }
            }
            if(s.length() >= 6){
                if(s.contains("p")){
                    result3 = true;
                }else{
                    result3 = false;
                }
            }
        }
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

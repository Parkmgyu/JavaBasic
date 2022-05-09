package javaExample11;

import java.util.Locale;

public class Practice1 {
    public static void main(String[] args) {
        var data = "aa0bcd1efg1gg0abc";
        boolean isCheck = true;

        for(char ch : data.toCharArray()){
            if(ch == '0'){
                isCheck = false;
            }else if(ch == '1'){
                isCheck = true;
            }else{
                System.out.print(isCheck? ch : (char) (ch - 32));
            }
        }
 /*       var builder = new StringBuilder();
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == '0' || data.charAt(i) == '1'){
                break;
            }
            builder.append(data.charAt(i));
        }
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == '0'){
                for(int j = i + 1; j < data.length(); j++){
                    if(data.charAt(j) == '1'){
                        break;
                    }
                    builder.append(Character.toUpperCase(data.charAt(j)));
                }

            }
            else if(data.charAt(i) == '1'){
                for(int j = i + 1; j < data.length(); j++){
                    if(data.charAt(j) == '0'){
                        break;
                    }else if(data.charAt(j) != '1') {
                        builder.append(Character.toLowerCase(data.charAt(j)));
                    }else{
                        break;
                    }
                }

            }

        }
        System.out.println(builder.toString());*/
    }
}

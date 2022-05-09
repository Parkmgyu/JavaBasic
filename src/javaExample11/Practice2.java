package javaExample11;

public class Practice2 {
    public static void main(String[] args) {
        var data = "ab0c1ba2bc9cd1";
        char t = 0;

        for(char ch : data.toCharArray()){
            if(ch > 90){
                System.out.print(ch);
            }else{
                System.out.print(String.valueOf(t).repeat(ch - 47));
            }
            t = ch;
        }
/*        var builder = new StringBuilder();
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) > '/' && data.charAt(i) < ':'){
                for(int j = 0; j < data.charAt(i) - '/'; j++){
                    builder.append(data.charAt(i - 1));
                }
            }else{
                builder.append(data.charAt(i));
            }
        }
        System.out.println(builder.toString());*/
    }
}

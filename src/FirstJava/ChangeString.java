package FirstJava;

public class ChangeString {
    public static void main(String[] args) {
        var data = "abcde";
        var builder = new StringBuilder();
        char temp = 0;
        for(int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);
            if(i % 2 == 0){
                temp = ch;
            }
            else{
                builder.append(ch);
                builder.append(temp);
            }
        }
        if(builder.length() < data.length()){
            builder.append(temp);
        }
        var result = builder.toString();
        System.out.println(result);
    }
}

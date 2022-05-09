package FirstJava;

import java.util.regex.Pattern;

public class ExamRegex6 {
    public static void main(String[] args) {
        var s = "보고싶다\n보고싶다\n보고싶다\nYES";

        var ptn = Pattern.compile("^.+", Pattern.DOTALL);
        var match = ptn.matcher(s);

        while(match.find()){
            System.out.println(match.group());
        }
    }
}

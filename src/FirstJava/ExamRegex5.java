package FirstJava;

import java.util.regex.Pattern;

public class ExamRegex5 {
    public static void main(String[] args) {
        var s = "1학년이 되면 친구\n180명을 사귈 수 있을까?\n";
        var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);
        var match = ptn.matcher(s);
        while(match.find()){
            System.out.println(match.group());
        }
    }
}

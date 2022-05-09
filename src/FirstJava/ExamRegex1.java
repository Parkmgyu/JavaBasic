package FirstJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamRegex1 {
    public static void main(String[] args) {
        String tel = "010-345-6531";

        Pattern p = Pattern.compile("\\d{3}-\\d{2,4}-\\d{4}");
        Matcher m = p.matcher(tel);

        System.out.println(m.find());
    }
}

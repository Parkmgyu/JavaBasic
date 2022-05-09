package FirstJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamRegex2 {
    public static void main(String[] args) {
        String s = "000012-345-6789";
        Pattern p = Pattern.compile(".*\\d{2,4}-\\d{2,4}-\\d{4}.*");
        //Pattern p = Pattern.compile(".*\\d{2,4}-\\d{2,4}-\\d{4}");
        //Pattern p = Pattern.compile("\\d{2,4}-\\d{2,4}-\\d{4}");
        Matcher m = p.matcher(s);

        System.out.println(m.find());
    }
}

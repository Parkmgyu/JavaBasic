package FirstJava;

import java.util.regex.Pattern;

public class ExamRegex4 {
    public static void main(String[] args) {
        var s = "업무용 이메일은 test@exam.com입니다. 개인용 이메일은 TEST@exam.com입니다.";
        var ptn = Pattern.compile("[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(\\.[a-z0-9-]+)*", Pattern.CASE_INSENSITIVE);
        var match = ptn.matcher(s);
        while(match.find()){
            System.out.println(match.group());
        }
    }
}

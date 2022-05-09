package FirstJava;

import java.util.regex.Pattern;

public class ExamRegex7 {
    public static void main(String[] args) {
        var tags = "<p><strong>회원</strong>사이트링크<a href ='index.html'><img src = 'member.jpg'/></a></p>";

        var ptn = Pattern.compile("<.+?>");
        var match = ptn.matcher(tags);
        while(match.find()){
            System.out.println(match.group());
        }
    }
}

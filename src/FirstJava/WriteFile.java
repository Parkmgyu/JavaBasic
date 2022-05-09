package FirstJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) {
        var msg = """
                test
                msg
                """;
        var p = Path.of("test.txt");
        try{
            Files.writeString(p, msg);
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}

package Path_L9;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Lesson9_NIO {


   public static void main(String[] args) {
      Lesson9_NIO nio= new Lesson9_NIO();
      Charset utf8 = StandardCharsets.UTF_8;
      List<String> lines = Arrays.asList("1st line", "2nd line");
      byte[] data = {1, 2, 3, 4, 5};

      try {
         Files.write(Paths.get("file1.txt"), "content ыыы".getBytes());
         Files.write(Paths.get("file2.txt"), "another content ыыы".getBytes(utf8));
         Files.write(Paths.get("file3.txt"), lines, utf8);
         Files.write(Paths.get("file4.txt"), lines, utf8,
                 StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      } catch (
              IOException e) {
         e.printStackTrace();
      }
   }

}

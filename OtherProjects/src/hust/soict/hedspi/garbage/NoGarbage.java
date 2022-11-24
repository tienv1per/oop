package hust.soict.hedspi.garbage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = new File("").getAbsolutePath() + "/src/hust/soict/hedspi/garbage/sample.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b: inputBytes){
            outputStringBuilder.append((char)b);
        }
        System.out.println("Time: "+(System.currentTimeMillis() - startTime) + " ms");
    }
}

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\info.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()));

        byte[] byteArray = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(byteArray);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path.toFile()));
        bufferedOutputStream.write(new String(byteArray).replaceAll("файл","1234").getBytes());

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}

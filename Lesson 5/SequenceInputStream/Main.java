import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {

        Vector<InputStream> vector = new Vector<>();

        Path pathOne = Paths.get("D:\\info.txt");
        Path pathTwo = Paths.get("D:\\banana.txt");
        Path pathThree = Paths.get("D:\\Линкер.txt");
        Path resultPath = Paths.get("D:\\result.txt");

        FileInputStream fileInputStreamOne = new FileInputStream(pathOne.toFile());
        FileInputStream fileInputStreamTwo = new FileInputStream(pathTwo.toFile());
        FileInputStream fileInputStreamThree = new FileInputStream(pathThree.toFile());

        vector.add(fileInputStreamOne);
        vector.add(fileInputStreamTwo);
        vector.add(fileInputStreamThree);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(vector.elements());
        FileOutputStream fileOutputStream = new FileOutputStream(resultPath.toFile());

        int z;
        while (true){
            if((z = sequenceInputStream.read())!= -1) fileOutputStream.write(z);
            else break;
        }
        sequenceInputStream.close();
        fileOutputStream.close();
    }
}

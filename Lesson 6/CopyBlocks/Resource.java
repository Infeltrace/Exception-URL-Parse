import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Resource {

    private Path pathFrom;
    private Path pathTo;
    private int threadCount;

    private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;

    private byte[] byteBlock;

    public Resource(String source, String destination, int threadCount) throws IOException {

        this.threadCount = threadCount;
        this.pathFrom = Paths.get(source);
        if(!pathFrom.toFile().exists()) throw new FileNotFoundException("Файл не найден!");
        this.pathTo = Paths.get(destination);
        if(!pathTo.toFile().exists()) pathTo.toFile().createNewFile();
        fileInputStream = new FileInputStream(source);
        fileOutputStream = new FileOutputStream(destination);
        byteBlock = new byte[((int)(pathFrom.toFile().length() / threadCount))];
    }

    public synchronized void copy() throws IOException {
        int part;

        if((part = fileInputStream.read(byteBlock)) > 0) fileOutputStream.write(byteBlock, 0 , part);
        else {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public int getThreadCount() {
        return threadCount;
    }
}




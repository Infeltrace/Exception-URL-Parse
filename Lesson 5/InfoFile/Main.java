import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

public class Main {

    private static Path firstPath = Paths.get("D:\\folder");
    private static File infoFile = new File(firstPath.toString()+ "\\info.txt");

    private static BufferedWriter bufferedWriter;

    public static void main(String[] args) throws IOException {

        if(!infoFile.exists()){
            infoFile.createNewFile();
        }
        bufferedWriter = new BufferedWriter(new FileWriter(infoFile));
        directoryCheck(firstPath.toString());
        bufferedWriter.close();
    }

    private static void directoryCheck(String srcPath) throws IOException {

        File srcFile = new File(srcPath);
        File[] srcFileArray = srcFile.listFiles();

        for (File f : srcFileArray){
            if(f.isFile()){
                writeInfo(f);
            } else{
                writeInfo(f);
                directoryCheck(f.getCanonicalPath());
            }
        }
    }

    private static void writeInfo(File readFile) throws IOException {

        bufferedWriter.write("Имя файла: " + readFile.getName());
        bufferedWriter.newLine();
        bufferedWriter.write("Путь файла: " + readFile.getCanonicalPath());
        bufferedWriter.newLine();
        bufferedWriter.write("Дата создания: " + new SimpleDateFormat().format(readFile.lastModified()));
        bufferedWriter.newLine();
        bufferedWriter.newLine();

    }
}

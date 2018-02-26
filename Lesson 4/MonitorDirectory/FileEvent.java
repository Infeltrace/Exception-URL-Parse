import java.io.File;
import java.text.SimpleDateFormat;

public class FileEvent implements IFileEvent {

    @Override
    public void onFileAdded(File file) {
        if(file.getName().endsWith(".txt")){
            System.out.println("Уходя гасите свет и в темноте гасите всех!");
        }else System.out.println("File added: " + file.getName() + "\nFile creation time" + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(file.lastModified()));
    }
}

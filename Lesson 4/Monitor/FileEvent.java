import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEvent implements IFileEvent {

    @Override
    public void onFileAdded(File file) throws IOException {
        System.out.println("File added: " + file.getName() + "\nFile creation time: " + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date(file.lastModified())));
    }
}

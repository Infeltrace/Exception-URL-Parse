import java.io.File;
import java.io.IOException;

public interface IFileEvent {

    void onFileAdded(File file) throws IOException;

}

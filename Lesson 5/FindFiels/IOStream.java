import java.io.File;
import java.io.FilenameFilter;

public class IOStream implements FilenameFilter {

    private String[] ext;

    public IOStream(String[] ext){
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        for (String anExt : ext) {
            if (name.endsWith(anExt)) return true;
        }
        return false;
    }
}


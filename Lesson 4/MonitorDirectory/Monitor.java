import java.io.File;
import java.util.Arrays;

public class Monitor {

    String path;
    IFileEvent event;

    public Monitor(String path, FileEvent event){
        this.path = path;
        this.event = event;
    }

    public void start()throws NullPointerException{

        File dir = new File(path);

        if(dir.isDirectory() && dir.exists()){
            File[] files = dir.listFiles();
            while (true){
                if(Arrays.equals(files,dir.listFiles())){
                }else {
                    if (dir.listFiles().length > files.length) {
                        for (int i = 0; i < files.length; i++) {
                            if (!files[i].equals(dir.listFiles()[i])) {
                                event.onFileAdded(dir.listFiles()[i]);
                                break;
                            } else if (i == files.length - 1) {
                                event.onFileAdded(dir.listFiles()[i + 1]);
                            }
                        }
                        files = dir.listFiles();
                    }else {
                        System.out.println("Был удалён файл!");
                        files = dir.listFiles();
                    }
                }
                try{
                    Thread.sleep(1500);
                }catch (InterruptedException e){

                }
            }
        }
    }
}




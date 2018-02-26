import java.io.File;
import java.io.IOException;

public class Monitor {

    String path, path2;
    IFileEvent event;

    public Monitor(String path, String path2, IFileEvent event){
        this.path = path;
        this.path2 = path2;
        this.event = event;
    }

    public void start() throws IOException{

        while (true){
            File f = new File(path);
            File f2 = new File(path2);

            if((f.exists() && f.isFile())){
                if(event != null){
                    event.onFileAdded(f);
                }
            } if((f2.exists() && f2.isFile())){
                event.onFileAdded(f2);
            } if(f.exists() && f2.exists()) break;

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+ "is interrupted :)");
            }

            System.out.println("W8ing");

        }
    }
}


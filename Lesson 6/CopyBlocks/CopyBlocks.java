import java.io.IOException;

public class CopyBlocks extends Thread {

    Resource resource;

    public CopyBlocks(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {

        try {
            resource.copy();
        } catch (IOException e) {
            return;
        }
    }
}

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args){

        Path pathFrom = Paths.get("D:\\result.txt");
        Path pathTo = Paths.get("D:\\result2.txt");

        try {
            Resource resource = new Resource(pathFrom.toString(),pathTo.toString(),4);
            for (int i = 0; i < resource.getThreadCount() + 1; i++) {
                new CopyBlocks(resource).start();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


    }
}

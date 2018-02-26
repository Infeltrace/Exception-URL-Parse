import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("D:\\xbox support.txt","D:\\Линкер.txt", new FileEvent());

        try {
            monitor.start();
        }catch (IOException e){
            System.out.println("smt is wrong");
        }
    }
}

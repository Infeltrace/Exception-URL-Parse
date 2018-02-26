public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("D:\\folder",new FileEvent());
        monitor.start();
    }
}

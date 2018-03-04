import java.util.Scanner;

public class MyThread extends Thread {

    ThreadGroup threadGroup = new ThreadGroup("MyGroup");
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {

        for (int i = 0; i <= 50; i++) {
            new FiftyThread(threadGroup,"FiftyThreads class thread number: " +i).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("For quit the application write \"exit\"");

        while (true){
            if(scanner.nextLine().equalsIgnoreCase("exit")){
                threadGroup.interrupt();
                break;
            }
        }

    }
}

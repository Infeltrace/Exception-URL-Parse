import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadGroup threadGroup = new ThreadGroup("NewThreadGroup");

        for (int i = 0; i < 100; i++) {
            MyThread myThread = new MyThread(threadGroup,"Thread: " +i);
            myThread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("To interrupt all threads input \"exit\"");

        if(scanner.nextLine().equalsIgnoreCase("exit")) threadGroup.interrupt();

    }
}

class MyThread extends Thread{

    public MyThread(ThreadGroup tg, String name){
        super(tg, name);
    }
    @Override
    public void run() {
        System.out.println(getName());
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            return;
        }
    }
}

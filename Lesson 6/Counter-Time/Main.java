import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String s;
        Time time = new Time();
        try{
            Counter counter = new Counter();
            counter.start();
            counter.join();

            System.out.println("Thread finished");
        }catch (Exception e){
            e.printStackTrace();
        }
        time.start();

        while (true){
        if((scanner.nextLine().equalsIgnoreCase("exit"))){
                time.interrupt();
                break;
        }
        }
    }
}


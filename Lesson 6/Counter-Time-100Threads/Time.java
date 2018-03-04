import java.text.SimpleDateFormat;

public class Time extends Thread {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    @Override
    public void run() {

        try {
            showTime();
        } catch (InterruptedException e) {
            return;
        }
    }

    private void showTime() throws InterruptedException{

        while (!isInterrupted()){
            System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
                Thread.sleep(2000);
        }
    }
}

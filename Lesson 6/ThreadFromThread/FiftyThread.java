public class FiftyThread extends Thread{

    public FiftyThread(ThreadGroup tg, String name){
        super(tg,name);
    }

    @Override
    public void run() {

        System.out.println(getName());
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            return;
        }

    }
}

public class Counter extends Thread {

    @Override
    public void run() {
        int x = 1;

        while (x < 1000){

            if(x >= 100 && x <= 200) System.out.println(x++);
            else x++;
        }
    }

}

package computer.home;

public class Multithreadthing implements Runnable{

    private int threadNumber;

    public Multithreadthing(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(i + " from thread " + threadNumber);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

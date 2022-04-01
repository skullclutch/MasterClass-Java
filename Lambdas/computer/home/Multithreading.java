package computer.home;

public class Multithreading {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Multithreadthing myThing = new Multithreadthing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }



    }
}

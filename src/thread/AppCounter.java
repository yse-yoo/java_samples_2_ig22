package thread;

public class AppCounter {

    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        
        Thread thread1 = new Thread(counter);
        thread1.start();
        
    }

}

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static final BlockingQueue<Integer> magazine = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {

        new Producer().start();
        new Producer().start();

        new Consumer().start();

    }
}

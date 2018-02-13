import java.util.Random;

public class Consumer extends Thread {

    Random random;

    public Consumer() {
//        super("Consumer");
        random = new Random();
    }

    public void run() {
        while (true) {

            int number = 0;
            try {
                number = Main.magazine.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Main.magazine.size());
            System.out.println(number);
            System.out.println(this.getName());

            try {
                Thread.sleep(random.nextInt(1001) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

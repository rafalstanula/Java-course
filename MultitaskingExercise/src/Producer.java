import java.util.Random;

public class Producer extends Thread {

    private Random random;

    public Producer() {
        super("Producer");
        random = new Random();
    }

    public void run() {
        while (Main.magazine.size() < 10) {
            int number = random.nextInt();
            System.out.println(number);
            try {
                Main.magazine.put(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(random.nextInt(1001) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
        for (int e: Main.magazine) {
            System.out.println(e);
        }

    }
}

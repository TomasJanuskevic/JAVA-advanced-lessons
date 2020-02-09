package Multithreading;

public class CreateThreads2 {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from myThread");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("myThread is over");
            }
        });

        myThread.start();
        Thread.sleep(1000);
        System.out.println("Hello from main Thread");
    }
}

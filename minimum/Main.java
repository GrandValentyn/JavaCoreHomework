package minimum;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThreat = new MyThread();
        myThreat.start();
        myThreat.join();

        RunnableThread runnableThread = new RunnableThread();
        Thread rThread = new Thread(runnableThread);
        rThread.start();
        rThread.join();
    }
}
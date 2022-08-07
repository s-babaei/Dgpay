package thread;

public class ThreadImpl extends Thread{

    @Override
    public void run() {
        System.out.println("Thread start.......!");
        System.out.println(currentThread().getId());

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadImpl thread=new ThreadImpl();
        ThreadImpl thread1=new ThreadImpl();
        thread1.start();
        ThreadImpl.sleep(5000);
        thread.run();

    }
}

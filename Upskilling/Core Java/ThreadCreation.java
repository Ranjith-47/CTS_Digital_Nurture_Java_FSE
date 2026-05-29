class ThreadDemo extends Thread {
    private String message;

    public ThreadDemo(String msg) {
        this.message = msg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " " + i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo("Thread 1");
        ThreadDemo T2 = new ThreadDemo("Thread 2");
        T1.start();
        T2.start();
    }
}
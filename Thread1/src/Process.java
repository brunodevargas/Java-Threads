public class Process {
    public static void main(String[] args) {
        System.out.println("Process that creates a Thread");
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        System.out.println("Process ended.");
    }
}
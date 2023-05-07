public class MyThread extends Thread {
    public void run() {
        System.out.println("I'm a Thread " + this.getId() + ". Bye");
    }
}

package mainThread;
public class NewThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("\t -- Creating a new Thread --\n");
        new NewThread2();
        System.out.println("Count-down from 10 to 0 in the main Thread :");
        try {
            for(int cnt = 10; cnt >= 0; --cnt) {
                System.out.println("Main Thread : " + cnt);
                Thread.sleep(1000);
            }
            System.out.println("Count-down of main Thread finished.");
        }
        catch(InterruptedException ie) {
            System.err.println("Main thread interrupted : " + ie);
        }
        System.out.println("\nThank you.");
    }
}
class NewThread2 extends Thread {
    NewThread2() {
        super("Child Thread");
        System.out.println("New child thread created : " + this);
        start();
    }
    public void run() {
        System.out.println("\nChild Thread started...");
        System.out.println("Count-down from 10 to 1 in the Child Thread :");
        try {
            Thread.sleep(500);
            for(int cnt = 10; cnt >= 1; --cnt) {
                System.out.println("Child Thread : " + cnt);
                Thread.sleep(1000);
            }
            System.out.println("Count-down of Child Thread finished.");
        }
        catch(InterruptedException ie) {
            System.err.println(this + " interrupted : " + ie);
        }
        System.out.println("Exiting from the Child Thread.");
    }
}

package swing;

public class NewThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("\t -- Creating a new Thread --\n");
        new NewThread1();
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
class NewThread1 implements Runnable {
    Thread objT;
    NewThread1() {
        objT = new Thread(this, "Child Thread");
        System.out.println("New child thread created : " + objT);
        objT.start();
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
            System.err.println(objT + " interrupted : " + ie);
        }
        System.out.println("Exiting from the Child Thread.");
    }
}




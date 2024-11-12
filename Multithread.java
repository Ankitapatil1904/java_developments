package swing;

public class Multithread2 {

	public static void main(String[] args) {


        ManagingMainThread obj = new ManagingMainThread();
        obj.threadDemo();

	}
}
	class ManagingMainThread{
		 void threadDemo() {
		Thread objT=	Thread.currentThread();//This line retrieves the reference to the currently executing thread
		  System.out.println("Current Thread : " + objT);
	        objT.setName("My Thread");// sets the name of the current thread to "My Thread"
	        System.out.println("Current Thread, after setting new name : " + objT);
	        System.out.println("\nCount-down from 10 to 0 :\n");
	        try {
	        	for(int cnt=10; cnt>=0; --cnt) {
	        		System.out.println(cnt);
	        		Thread.sleep(1000);//line causes the current thread to pause for 1000 milliseconds 
	        	}
	        	
	        }
	        catch(InterruptedException ie) {// catch block that will handle InterruptedException, which may occur if the thread is interrupted while sleeping.
	        	System.err.println(objT + " interrupted : " + ie);
	        }

	}

}

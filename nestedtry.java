package exception;

public class Nestedtry {
	public static void main(String[] args) {
		try {
			arthematicop();
			
		}
		catch(Exception ex) {
			System.out.println("the exception is :"+ex);
		}
	}
	static void arthematicop()
	{
		System.out.println("enter the two numbers :");
		int a[]=new int[5];
		try {
			a[0]=Integer.parseInt(System.console().readLine());
			 a[1]=Integer.parseInt(System.console().readLine());
	try {
		a[2]=a[1]/a[0];
		System.out.println("division is :"+a[2]);
	}
	catch(ArithmeticException ae) {
		  System.err.println("Exception handled in nested try block : " + ae);
	}
			
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("Exception handled in outer try block : " +nfe);
		}
		System.out.println("Returning from the arithmeticOperations().");
	}

}

package exception;
import java.awt.Frame;
import java.awt.Button;

public class AWTGUI2 {

	public AWTGUI2() {
		Button btn=new Button("click me");
		Frame objF=new Frame();
		 btn.setBounds(50, 100, 120, 40);
	        objF.add(btn);
	        objF.setSize(800, 600);
	        objF.setLayout(null);
	        objF.setVisible(true);
	    }

		
	

	public static void main(String[] args) {
		System.out.println("AWTGUI2");
		 new AWTGUI2();
		System.out.println("thank-you");

	}

}

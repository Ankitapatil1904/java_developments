package exception;
import java.awt.Frame;
import java.awt.Button;


public class AWTGUI1 extends Frame {

	

	public static void main(String[] args) {
		System.out.println("GUI PROGRAMMING");
		new AWTGUI1();
		System.out.println("thankyou");

	}
	AWTGUI1(){
		Button btn=new Button('CLICK ME');
		btn.setBounds(50, 100, 120, 40);//x,y,width,height of button
		add(btn);//adds button on the screen
		setSize(800, 600);//sets size of the frame
		setLayout(null);//layout of the frame will be managed manually
		setVisible(true);//frame is visible on the screen
	}

}

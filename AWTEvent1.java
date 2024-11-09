package exception;
import java.awt.*;
import java.awt.event.*;


public class AWTEvent1 implements ActionListener {
Label lbl;
	public AWTEvent1() {
		Button btn=new Button("click me");
		  btn.setBounds(80, 100, 120, 40);
	        btn.addActionListener(this);//performs action
	        lbl=new Label();//use to display message in GUI
	        lbl.setBounds(80, 150, 200, 25);
	        Frame objF = new Frame();
	        objF.add(btn);//used to add button on frame
	        objF.add(lbl);//used to add label on frame
	        objF.setSize(800, 600);
	        objF.setLayout(null);
	        objF.setVisible(true);
	        
		
	}

	public static void main(String[] args) {
		new AWTEvent1();
		

	}
	 public void actionPerformed(ActionEvent ae) {
	        lbl.setText("Hello! You clicked the button.");
	    }

}

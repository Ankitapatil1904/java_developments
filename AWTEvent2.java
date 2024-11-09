package exception;
import java.awt.*;
import java.awt.event.*;
class AWTEvent2 {
    Label lblResult;
    TextField txtNo;
    public static void main(String[]args) {
        System.out.println("\t -- AWT Event Handling Demo --\n");
        new AWTEvent2();
        System.out.println("Thank you.");
    }
    AWTEvent2() {
        Label lblIp = new Label("Enter a number : ");
        lblIp.setBounds(50, 100, 90, 25);
        txtNo = new TextField();
        txtNo.setBounds(150, 100, 50, 25);
        Button btn = new Button("Square of Number");
        btn.setBounds(80, 150, 120, 40);
        ButtonClickEvent obj = new ButtonClickEvent(this);
        btn.addActionListener(obj);
        lblResult = new Label();
        lblResult.setBounds(80, 200, 200, 25);
        Frame objF = new Frame();
        objF.add(lblIp);
        objF.add(txtNo);
        objF.add(btn);
        objF.add(lblResult);
        objF.setSize(800, 600);
        objF.setLayout(null);
        objF.setVisible(true);
    }
}
class ButtonClickEvent implements ActionListener {
    AWTEvent2 obj;
    ButtonClickEvent(AWTEvent2 obj) {//When the button is clicked, the action Performed method in ButtonClickEvent will be called.
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent ae) {
        int i = Integer.parseInt(obj.txtNo.getText());
        obj.lblResult.setText("Square of " + i + " is " + (i * i));
    }
}


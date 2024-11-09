package swing;


import javax.swing.JFrame;
import javax.swing.JButton;
public class SwingGUI2 {
    public static void main(String[] args) {
        System.out.println("\t -- GUI Application using AWT --\n");
        new SwingGUI1();
        System.out.println("\nThank you.");
    }
    SwingGUI2() {
        JFrame objF = new JFrame();
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 120, 40);
        objF.add(btn);
        objF.setSize(800, 600);
        objF.setLayout(null);
        objF.setVisible(true);
    }
}

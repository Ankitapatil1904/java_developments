package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
public class SwingGUI1 extends JFrame {
    public static void main(String[] args) {
        System.out.println("\t -- GUI Application using AWT --\n");
        new SwingGUI1();
        System.out.println("\nThank you.");
    }
    SwingGUI1() {
        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 120, 40);
        add(btn);
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
    }
}

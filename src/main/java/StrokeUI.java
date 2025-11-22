import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StrokeUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stroke UI");
        Diagnosis diagnosis1 = new Diagnosis();
        Display display1 = new Display(diagnosis1);
        System.out.println(diagnosis1.getName());


        frame.setLayout(new GridLayout(1, 2));
        frame.setSize(800, 400);

        frame.add(display1);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {    // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
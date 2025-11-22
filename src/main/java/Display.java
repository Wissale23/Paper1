import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Display extends JPanel {

    public Display(Diagnosis diagnosis1){
        JLabel label = new JLabel();
        add(label);

        URL imageURL = null;

        try {
            imageURL = new URL(diagnosis1.getPatientURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);

    }
}

package UIData;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;


public class DisplayImage extends JPanel {

    public DisplayImage(String url){
        JLabel label= new JLabel();
        URL imageURL = null;

        try {
            imageURL = new URL(url);
            //System.out.println("Image width: " + icon.getIconWidth() + ", height: " + icon.getIconHeight());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

        ImageIcon icon = new ImageIcon(imageURL);
        label.setIcon(icon);
        add(label);

    }
}
